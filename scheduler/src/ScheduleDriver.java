import bl.FeasiblePackage;
import bl.Nurse;
import utils.CSVUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by klajdi on 4/9/17.
 */
public class ScheduleDriver {
    public static void main(String[] args){


        // Temporary database

        //List of nurses

        //List of visits
        // TODO: 4/9/17

        //List of ScheduleRecords

        Map<Integer, FeasiblePackage> records = new HashMap<Integer, FeasiblePackage >();

        Set<Nurse> nurses = new TreeSet<Nurse>();

        List<Nurse> nurseList = new ArrayList<Nurse>();




        // ------ end ---- Temporary database

        // Parse the csv
        String csvFile = "/Users/klajdi/IdeaProjects/scheduler/src/sample.csv";
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(csvFile));

            //Parser, analyze the csv line by line
            while (scanner.hasNext()) {

                //Parse the line
                List<String> line = CSVUtil.parseLine(scanner.nextLine());

                //Test print the line
               // System.out.println("nurse [id= " + line.get(0) + ", bundle= " + line.get(1) + " , price=" + line.get(2) + "]");

                //Create a FeasiblePackage and insert a new ScheduleRecord

                String trimmedVisits = line.get(1).replaceAll("^\"|\"$", "");
                FeasiblePackage feasible = new FeasiblePackage();
                feasible.schedule.put(trimmedVisits, Float.valueOf(line.get(2)));

                System.out.println("nurse [id= " + line.get(0) + ", bundle= " + line.get(1) + " , price=" + line.get(2) + "]");



                //Iterator it = nurses.iterator();
                Iterator it = nurseList.iterator();

                boolean existing = false;

                while(it.hasNext()){
                    Nurse n = (Nurse)it.next();

                    if(n.getId() == Integer.parseInt(line.get(0))){
                        n.getFeasiblePackage().schedule.put(trimmedVisits,Float.valueOf(line.get(2)));
                        existing = true;
                        break;
                    }
                }

                if(!existing) {
                    Nurse nurse = new Nurse(Integer.parseInt(line.get(0)));
                    nurse.getFeasiblePackage().schedule.put(trimmedVisits,Float.valueOf(line.get(2)));
                    //System.out.println("--newly entered "+ nurse.getId());
                    //nurses.add(nurse);
                    nurseList.add(nurse);
                }

            }
        }
        catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        finally {
            scanner.close();
        }

        //Iterator it = nurses.iterator();
        Iterator it = nurseList.iterator();

        while(it.hasNext()){
            Nurse n = (Nurse)it.next();

            System.out.println("nurse "+ n.getId());

            Iterator in = n.getFeasiblePackage().schedule.keySet().iterator();
            while(in.hasNext()) {
                String key = (String)in.next();
                System.out.println(key+" - "+n.getFeasiblePackage().schedule.get(key));

            }

        }

        String arrangement = "";
        for(int i=0; i < nurseList.size(); i++){
            arrangement = arrangement + i;

        }

        System.out.println(arrangement);


        long start_time = System.currentTimeMillis();

        ScheduleDriver.permutation(arrangement);

        long end_time = System.currentTimeMillis();

        System.out.println((end_time-start_time)/1000);





    }

    public static void permutation(String str) {
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
            for (int i = 0; i < prefix.length(); i++){
                System.out.println(prefix.charAt(i));
                try {
                    TimeUnit.MILLISECONDS.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }
        else {
            for (int i = 0; i < n; i++){
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
            }
        }
    }
}
