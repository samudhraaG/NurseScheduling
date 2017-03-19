﻿var ajaxClass = {};
ajaxClass.url = null;
ajaxClass.type = null;
ajaxClass.data = null;
ajaxClass.contentType = null;
ajaxClass.dataType = null;
ajaxClass.success = null;
ajaxClass.complete = null;
ajaxClass.error = null;


Array.prototype.Any = function(predicate) {
    return Any(this, predicate);
}

Array.prototype.FirstOrDefault = function(predicate) {
    return FirstOrDefault(this, predicate);
}


// Extensions
function Any(array, predicate) {
    var i = 0;
    var max = array.length;

    for (i = 0; i < max; i++) {
        if (predicate(array[i])) {
            return true;
        }
    }

    // not found
    return false;
}

function FirstOrDefault(array, predicate) {
    var i = 0;
    var max = array.length;

    for (i = 0; i < max; i++) {
        if (predicate(array[i])) {
            return array[i];
        }
    }

    // not found
    return null;
}

function Distinct(array, comparator) {
    var result = [];

    for (var i = 0; i < array.length; i++) {
        var isAlreadyInside = false;

        for (var k = 0; k < result.length; k++) {
            if (comparator(array[i]) == comparator(result[k])) {
                isAlreadyInside = true;
                break;
            }
        }

        if (!isAlreadyInside) {
            result.push(array[i]);
        }
    }

    return result;
}


function s4() {
    return Math.floor((1 + Math.random()) * 0x10000)
        .toString(16)
        .substring(1);
};

// GUID
var Guid = {};

Guid.Empty = "00000000-0000-0000-0000-000000000000";

Guid.NewGuid = function() {
    return s4() + s4() + '-' + s4() + '-4' + s4().substr(0, 3) + '-' +
        s4() + '-' + s4() + s4() + s4();
};


function cancelEvent(event) {
    event.cancelBubble = true;
    event.preventDefault();
    return false;
}


// session keepalive
$(document).ready(function() {
    var refreshTime = 2 * 60 * 1000; // in milliseconds, so 2 minutes
    window.setInterval(function() {
        //alert("Keeping alive!");
        if ((window.location.pathname.length > 1) && window.location.href.toLowerCase().indexOf("login") < 0) {
            var url = baseURL + '/home/keepalive?t=' + new Date().getTimezoneOffset();
            $.get(url, function(t) { /*do nothing*/ });
        }
    }, refreshTime);

    $(".changelanguageanchor").click(function(e) {

        var old_url = window.location.href;

        if (old_url.indexOf("#?") > 0) {
            // ---#?---
            old_url = old_url.replace("#?", "?");
        } else if (old_url[old_url.length - 1] == "#") {
            old_url = old_url.replace("#", "");
        }

        if (old_url.indexOf("?") > 0) {
            //window.location.href = window.location.href + ($(this).attr("href").replace("?","&"))
            var lang_url = $(this).attr("href");

            if ((old_url.indexOf("?lang=en") > 0) || (old_url.indexOf("?lang=fr") > 0)) {
                old_url = old_url.replace("?lang=en", lang_url);
                old_url = old_url.replace("?lang=fr", lang_url);
            } else if ((old_url.indexOf("&lang=en") > 0) || (old_url.indexOf("&lang=fr") > 0)) {
                old_url = old_url.replace("&lang=en", lang_url.replace("?", "&"));
                old_url = old_url.replace("&lang=fr", lang_url.replace("?", "&"));
            } else {
                old_url = window.location.href + lang_url.replace("?", "&");
            }

            window.location.href = old_url;
        } else {
            //window.location.href = window.location.href + $(this).attr("href")
            window.location.href = old_url + $(this).attr("href")
        }

        e.preventDefault();
        return false;

    });


    if ((typeof _user != 'undefined') && _user.Role == 10) {
        $("input[type=submit]").attr("disabled", "disabled");
    }


});

function isMSIE() {
    return (navigator.userAgent.search("MSIE") > 0);
}



function IsNullOrEmpty(str) {
    return (!str) || (str.length = 0);
}

// date from iso
(function() {
    var D = new Date('2011-06-02T09:34:29+02:00');
    if (!D || +D !== 1307000069000) {
        Date.fromISO = function(s) {
            var day, tz,
                rx = /^(\d{4}\-\d\d\-\d\d([tT ][\d:\.]*)?)([zZ]|([+\-])(\d\d):(\d\d))?$/,
                p = rx.exec(s) || [];
            if (p[1]) {
                day = p[1].split(/\D/);
                for (var i = 0, L = day.length; i < L; i++) {
                    day[i] = parseInt(day[i], 10) || 0;
                };
                day[1] -= 1;
                day = new Date(Date.UTC.apply(Date, day));
                if (!day.getDate()) return NaN;
                if (p[5]) {
                    tz = (parseInt(p[5], 10) * 60);
                    if (p[6]) tz += parseInt(p[6], 10);
                    if (p[4] == '+') tz *= -1;
                    if (tz) day.setUTCMinutes(day.getUTCMinutes() + tz);
                }
                return day;
            }
            return NaN;
        }
    } else {
        Date.fromISO = function(s) {
            return new Date(s);
        }
    }


    Date.fromISONoTZ = function(s) {
        var day, tz,
            rx = /^(\d{4}\-\d\d\-\d\d([tT ][\d:\.]*)?)([zZ]|([+\-])(\d\d):(\d\d))?$/,
            p = rx.exec(s) || [];
        if (p[1]) {
            day = p[1].split(/\D/);
            for (var i = 0, L = day.length; i < L; i++) {
                day[i] = parseInt(day[i], 10) || 0;
            };
            day[1] -= 1;
            day = new Date(parseInt(day[0]), parseInt(day[1]), parseInt(day[2]), parseInt(day[3]), parseInt(day[4]));
            if (!day.getDate()) return NaN;
            if (p[5]) {
                //tz = (parseInt(p[5], 10) * 60);
                //if (p[6]) tz += parseInt(p[6], 10);
                //if (p[4] == '+') tz *= -1;
                //if (tz) day.setUTCMinutes(day.getUTCMinutes() + tz);
            }
            return day;
        }
        return NaN;
    }


    Date.prototype.displayAsTimeZone = function(tz) {
        var currtz = this.getTimezoneOffset();

        diff = currtz - tz;

        var result = new Date(this.getTime() - diff * 60000);

        return result;
    }

    Date.prototype.undisplayAsTimeZone = function(tz) {
        var currtz = this.getTimezoneOffset();

        diff = -currtz + tz;

        var result = new Date(this.getTime() - diff * 60000);

        return result;
    }
})()

// JSON!
/*! JSON v3.2.5 | http://bestiejs.github.io/json3 | Copyright 2012-2013, Kit Cambridge | http://kit.mit-license.org */
;
(function() {
    var o = !0,
        w = null;
    (function(B) {
        function v(a) {
            if ("bug-string-char-index" == a) return "a" != "a" [0];
            var f, c = "json" == a;
            if (c || "json-stringify" == a || "json-parse" == a) {
                if ("json-stringify" == a || c) {
                    var d = k.stringify,
                        b = "function" == typeof d && l;
                    if (b) {
                        (f = function() { return 1 }).toJSON = f;
                        try {
                            b = "0" === d(0) && "0" === d(new Number) && '""' == d(new String) && d(m) === r && d(r) === r && d() === r && "1" === d(f) && "[1]" == d([f]) && "[null]" == d([r]) && "null" == d(w) && "[null,null,null]" == d([r, m, w]) && '{"a":[1,true,false,null,"\\u0000\\b\\n\\f\\r\\t"]}' == d({ a: [f, o, !1, w, "\x00\u0008\n\u000c\r\t"] }) &&
                                "1" === d(w, f) && "[\n 1,\n 2\n]" == d([1, 2], w, 1) && '"-271821-04-20T00:00:00.000Z"' == d(new Date(-864E13)) && '"+275760-09-13T00:00:00.000Z"' == d(new Date(864E13)) && '"-000001-01-01T00:00:00.000Z"' == d(new Date(-621987552E5)) && '"1969-12-31T23:59:59.999Z"' == d(new Date(-1))
                        } catch (n) { b = !1 }
                    }
                    if (!c) return b
                }
                if ("json-parse" == a || c) {
                    a = k.parse;
                    if ("function" == typeof a) try {
                        if (0 === a("0") && !a(!1)) {
                            f = a('{"a":[1,true,false,null,"\\u0000\\b\\n\\f\\r\\t"]}');
                            var e = 5 == f.a.length && 1 === f.a[0];
                            if (e) {
                                try { e = !a('"\t"') } catch (g) {}
                                if (e) try {
                                    e =
                                        1 !== a("01")
                                } catch (i) {}
                            }
                        }
                    } catch (O) { e = !1 }
                    if (!c) return e
                }
                return b && e
            }
        }
        var m = {}.toString,
            p, C, r, D = typeof define === "function" && define.amd,
            k = "object" == typeof exports && exports;
        k || D ? "object" == typeof JSON && JSON ? k ? (k.stringify = JSON.stringify, k.parse = JSON.parse) : k = JSON : D && (k = B.JSON = {}) : k = B.JSON || (B.JSON = {});
        var l = new Date(-3509827334573292);
        try { l = -109252 == l.getUTCFullYear() && 0 === l.getUTCMonth() && 1 === l.getUTCDate() && 10 == l.getUTCHours() && 37 == l.getUTCMinutes() && 6 == l.getUTCSeconds() && 708 == l.getUTCMilliseconds() } catch (P) {}
        if (!v("json")) {
            var s =
                v("bug-string-char-index");
            if (!l) var t = Math.floor,
                J = [0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334],
                z = function(a, f) { return J[f] + 365 * (a - 1970) + t((a - 1969 + (f = +(f > 1))) / 4) - t((a - 1901 + f) / 100) + t((a - 1601 + f) / 400) };
            if (!(p = {}.hasOwnProperty)) p = function(a) {
                var f = {},
                    c;
                if ((f.__proto__ = w, f.__proto__ = { toString: 1 }, f).toString != m) p = function(a) { var f = this.__proto__,
                        a = a in (this.__proto__ = w, this);
                    this.__proto__ = f; return a };
                else {
                    c = f.constructor;
                    p = function(a) {
                        var f = (this.constructor || c).prototype;
                        return a in this && !(a in f &&
                            this[a] === f[a])
                    }
                }
                f = w;
                return p.call(this, a)
            };
            var K = { "boolean": 1, number: 1, string: 1, undefined: 1 };
            C = function(a, f) {
                var c = 0,
                    b, h, n;
                (b = function() { this.valueOf = 0 }).prototype.valueOf = 0;
                h = new b;
                for (n in h) p.call(h, n) && c++;
                b = h = w;
                if (c) c = c == 2 ? function(a, f) { var c = {},
                        b = m.call(a) == "[object Function]",
                        d; for (d in a) !(b && d == "prototype") && !p.call(c, d) && (c[d] = 1) && p.call(a, d) && f(d) } : function(a, f) {
                    var c = m.call(a) == "[object Function]",
                        b, d;
                    for (b in a) !(c && b == "prototype") && p.call(a, b) && !(d = b === "constructor") && f(b);
                    (d || p.call(a,
                        b = "constructor")) && f(b)
                };
                else { h = ["valueOf", "toString", "toLocaleString", "propertyIsEnumerable", "isPrototypeOf", "hasOwnProperty", "constructor"];
                    c = function(a, f) { var c = m.call(a) == "[object Function]",
                            b, d; if (d = !c)
                            if (d = typeof a.constructor != "function") { d = typeof a.hasOwnProperty;
                                d = d == "object" ? !!a.hasOwnProperty : !K[d] }
                        d = d ? a.hasOwnProperty : p; for (b in a) !(c && b == "prototype") && d.call(a, b) && f(b); for (c = h.length; b = h[--c]; d.call(a, b) && f(b)); } }
                c(a, f)
            };
            if (!v("json-stringify")) {
                var L = {
                        92: "\\\\",
                        34: '\\"',
                        8: "\\b",
                        12: "\\f",
                        10: "\\n",
                        13: "\\r",
                        9: "\\t"
                    },
                    u = function(a, f) { return ("000000" + (f || 0)).slice(-a) },
                    G = function(a) { var f = '"',
                            b = 0,
                            d = a.length,
                            h = d > 10 && s,
                            n; for (h && (n = a.split("")); b < d; b++) { var e = a.charCodeAt(b); switch (e) {
                                case 8:
                                case 9:
                                case 10:
                                case 12:
                                case 13:
                                case 34:
                                case 92:
                                    f = f + L[e]; break;
                                default:
                                    if (e < 32) { f = f + ("\\u00" + u(2, e.toString(16))); break }
                                    f = f + (h ? n[b] : s ? a.charAt(b) : a[b]) } } return f + '"' },
                    E = function(a, b, c, d, h, n, e) {
                        var g = b[a],
                            i, j, k, l, q, s, v, x, y;
                        try { g = b[a] } catch (A) {}
                        if (typeof g == "object" && g) {
                            i = m.call(g);
                            if (i == "[object Date]" &&
                                !p.call(g, "toJSON"))
                                if (g > -1 / 0 && g < 1 / 0) { if (z) { k = t(g / 864E5); for (i = t(k / 365.2425) + 1970 - 1; z(i + 1, 0) <= k; i++); for (j = t((k - z(i, 0)) / 30.42); z(i, j + 1) <= k; j++);
                                        k = 1 + k - z(i, j);
                                        l = (g % 864E5 + 864E5) % 864E5;
                                        q = t(l / 36E5) % 24;
                                        s = t(l / 6E4) % 60;
                                        v = t(l / 1E3) % 60;
                                        l = l % 1E3 } else { i = g.getUTCFullYear();
                                        j = g.getUTCMonth();
                                        k = g.getUTCDate();
                                        q = g.getUTCHours();
                                        s = g.getUTCMinutes();
                                        v = g.getUTCSeconds();
                                        l = g.getUTCMilliseconds() }
                                    g = (i <= 0 || i >= 1E4 ? (i < 0 ? "-" : "+") + u(6, i < 0 ? -i : i) : u(4, i)) + "-" + u(2, j + 1) + "-" + u(2, k) + "T" + u(2, q) + ":" + u(2, s) + ":" + u(2, v) + "." + u(3, l) + "Z" } else g =
                                    w;
                            else if (typeof g.toJSON == "function" && (i != "[object Number]" && i != "[object String]" && i != "[object Array]" || p.call(g, "toJSON"))) g = g.toJSON(a)
                        }
                        c && (g = c.call(b, a, g));
                        if (g === w) return "null";
                        i = m.call(g);
                        if (i == "[object Boolean]") return "" + g;
                        if (i == "[object Number]") return g > -1 / 0 && g < 1 / 0 ? "" + g : "null";
                        if (i == "[object String]") return G("" + g);
                        if (typeof g == "object") {
                            for (a = e.length; a--;)
                                if (e[a] === g) throw TypeError();
                            e.push(g);
                            x = [];
                            b = n;
                            n = n + h;
                            if (i == "[object Array]") {
                                j = 0;
                                for (a = g.length; j < a; y || (y = o), j++) {
                                    i = E(j, g, c, d, h, n,
                                        e);
                                    x.push(i === r ? "null" : i)
                                }
                                a = y ? h ? "[\n" + n + x.join(",\n" + n) + "\n" + b + "]" : "[" + x.join(",") + "]" : "[]"
                            } else { C(d || g, function(a) { var b = E(a, g, c, d, h, n, e);
                                    b !== r && x.push(G(a) + ":" + (h ? " " : "") + b);
                                    y || (y = o) });
                                a = y ? h ? "{\n" + n + x.join(",\n" + n) + "\n" + b + "}" : "{" + x.join(",") + "}" : "{}" }
                            e.pop();
                            return a
                        }
                    };
                k.stringify = function(a, b, c) {
                    var d, h, j;
                    if (typeof b == "function" || typeof b == "object" && b)
                        if (m.call(b) == "[object Function]") h = b;
                        else if (m.call(b) == "[object Array]") {
                        j = {};
                        for (var e = 0, g = b.length, i; e < g; i = b[e++], (m.call(i) == "[object String]" ||
                                m.call(i) == "[object Number]") && (j[i] = 1));
                    }
                    if (c)
                        if (m.call(c) == "[object Number]") { if ((c = c - c % 1) > 0) { d = ""; for (c > 10 && (c = 10); d.length < c; d = d + " "); } } else m.call(c) == "[object String]" && (d = c.length <= 10 ? c : c.slice(0, 10));
                    return E("", (i = {}, i[""] = a, i), h, j, d, "", [])
                }
            }
            if (!v("json-parse")) {
                var M = String.fromCharCode,
                    N = { 92: "\\", 34: '"', 47: "/", 98: "\u0008", 116: "\t", 110: "\n", 102: "\u000c", 114: "\r" },
                    b, A, j = function() { b = A = w; throw SyntaxError(); },
                    q = function() {
                        for (var a = A, f = a.length, c, d, h, k, e; b < f;) {
                            e = a.charCodeAt(b);
                            switch (e) {
                                case 9:
                                case 10:
                                case 13:
                                case 32:
                                    b++;
                                    break;
                                case 123:
                                case 125:
                                case 91:
                                case 93:
                                case 58:
                                case 44:
                                    c = s ? a.charAt(b) : a[b];
                                    b++;
                                    return c;
                                case 34:
                                    c = "@";
                                    for (b++; b < f;) {
                                        e = a.charCodeAt(b);
                                        if (e < 32) j();
                                        else if (e == 92) { e = a.charCodeAt(++b); switch (e) {
                                                case 92:
                                                case 34:
                                                case 47:
                                                case 98:
                                                case 116:
                                                case 110:
                                                case 102:
                                                case 114:
                                                    c = c + N[e];
                                                    b++; break;
                                                case 117:
                                                    d = ++b; for (h = b + 4; b < h; b++) { e = a.charCodeAt(b);
                                                        e >= 48 && e <= 57 || e >= 97 && e <= 102 || e >= 65 && e <= 70 || j() }
                                                    c = c + M("0x" + a.slice(d, b)); break;
                                                default:
                                                    j() } } else {
                                            if (e == 34) break;
                                            e = a.charCodeAt(b);
                                            for (d = b; e >= 32 && e != 92 && e != 34;) e = a.charCodeAt(++b);
                                            c = c + a.slice(d, b)
                                        }
                                    }
                                    if (a.charCodeAt(b) == 34) { b++; return c }
                                    j();
                                default:
                                    d = b;
                                    if (e == 45) { k = o;
                                        e = a.charCodeAt(++b) }
                                    if (e >= 48 && e <= 57) { for (e == 48 && (e = a.charCodeAt(b + 1), e >= 48 && e <= 57) && j(); b < f && (e = a.charCodeAt(b), e >= 48 && e <= 57); b++); if (a.charCodeAt(b) == 46) { for (h = ++b; h < f && (e = a.charCodeAt(h), e >= 48 && e <= 57); h++);
                                            h == b && j();
                                            b = h }
                                        e = a.charCodeAt(b); if (e == 101 || e == 69) { e = a.charCodeAt(++b);
                                            (e == 43 || e == 45) && b++; for (h = b; h < f && (e = a.charCodeAt(h), e >= 48 && e <= 57); h++);
                                            h == b && j();
                                            b = h } return +a.slice(d, b) }
                                    k && j();
                                    if (a.slice(b, b + 4) == "true") {
                                        b =
                                            b + 4;
                                        return o
                                    }
                                    if (a.slice(b, b + 5) == "false") { b = b + 5; return false }
                                    if (a.slice(b, b + 4) == "null") { b = b + 4; return w }
                                    j()
                            }
                        }
                        return "$"
                    },
                    F = function(a) {
                        var b, c;
                        a == "$" && j();
                        if (typeof a == "string") {
                            if ((s ? a.charAt(0) : a[0]) == "@") return a.slice(1);
                            if (a == "[") { for (b = [];; c || (c = o)) { a = q(); if (a == "]") break; if (c)
                                        if (a == ",") { a = q();
                                            a == "]" && j() } else j();
                                    a == "," && j();
                                    b.push(F(a)) } return b }
                            if (a == "{") {
                                for (b = {};; c || (c = o)) {
                                    a = q();
                                    if (a == "}") break;
                                    if (c)
                                        if (a == ",") { a = q();
                                            a == "}" && j() } else j();
                                        (a == "," || typeof a != "string" || (s ? a.charAt(0) : a[0]) != "@" ||
                                            q() != ":") && j();
                                    b[a.slice(1)] = F(q())
                                }
                                return b
                            }
                            j()
                        }
                        return a
                    },
                    I = function(a, b, c) { c = H(a, b, c);
                        c === r ? delete a[b] : a[b] = c },
                    H = function(a, b, c) { var d = a[b],
                            h; if (typeof d == "object" && d)
                            if (m.call(d) == "[object Array]")
                                for (h = d.length; h--;) I(d, h, c);
                            else C(d, function(a) { I(d, a, c) });
                        return c.call(a, b, d) };
                k.parse = function(a, f) { var c, d;
                    b = 0;
                    A = "" + a;
                    c = F(q());
                    q() != "$" && j();
                    b = A = w; return f && m.call(f) == "[object Function]" ? H((d = {}, d[""] = c, d), "", f) : c }
            }
        }
        D && define(function() { return k })
    })(this);
}());

function AjaxGet(url, data, onsuccess, onfailed, oncomplete) {
    AjaxCore("GET", false, url, data, onsuccess, onfailed, oncomplete)
};

function AjaxGet_Overlay(url, data, onsuccess, onfailed, oncomplete) {
    AjaxCore("GET", true, url, data, onsuccess, onfailed, oncomplete)
};

function AjaxPost(url, data, onsuccess, onfailed, oncomplete) {
    AjaxCore("POST", false, url, data, onsuccess, onfailed, oncomplete)
};

//function AjaxPost_Overlay(url, data, onsuccess, onfailed, oncomplete) {
//    AjaxCore("POST", true, url, data, onsuccess, onfailed, oncomplete)
//};

function AjaxPost_Overlay(obj) {
    AjaxCore("POST", true, obj.contentType, obj.url, obj.data, obj.onsuccess, obj.onfailed, obj.oncomplete)
};

function AjaxCore(method, hasWaiting, contentType, url, data, onsuccess, onfailed, oncomplete) {
    if (hasWaiting == true) {
        if ($('body>.waiting-overlay').length == 0) {
            $('body').append('<div class="waiting-overlay" style=""></div>');
        }
        $('body .waiting-overlay').css('height', $('body').height()).show();
    }

    if (contentType != undefined && contentType != '') {
        $.ajax({
            url: url,
            type: method,
            data: data,
            contentType: contentType, //contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function(t) {
                if (onsuccess != undefined) {
                    onsuccess(t);
                }
            },
            complete: function(t) {
                if (hasWaiting == true) {
                    $(".waiting-overlay").hide();
                }

                if (oncomplete != undefined) {
                    oncomplete(t);
                }
            },
            error: function(t) {
                if (onfailed != undefined) {
                    onfailed(t);
                }
            }
        });
    } else {
        $.ajax({
            url: url,
            type: method,
            data: data,
            success: function(t) {
                if (onsuccess != undefined) {
                    onsuccess(t);
                }
            },
            complete: function(t) {
                if (hasWaiting == true) {
                    $(".waiting-overlay").hide();
                }

                if (oncomplete != undefined) {
                    oncomplete(t);
                }
            },
            error: function(t) {
                if (onfailed != undefined) {
                    onfailed(t);
                }
            }
        });
    }
};