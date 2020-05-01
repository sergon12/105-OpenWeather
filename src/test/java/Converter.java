import org.joda.time.LocalDateTime;
import org.junit.Test;


public class Converter {

    @Test
    public void convertLongToTime() {

        long current = System.currentTimeMillis();

        String moment;

        long[] list = {
                1583033193,	1583072232,
                1583033193,	1583072232,
                1583033193,	1583072232,
                1583119455,	1583158746,
                1583291977,	1583331771,
                1583291977,	1583331771,
                1583291977,	1583331771,
                1583464497,	1583504795,
                1583464497,	1583504795,
                1583550756,	1583591306,
                1583550756,	1583591306,
                1583550756,	1583591306,
                1583550756,	1583591306,
                1583550756,	1583591306,
                1583550756,	1583591306,
                1583550756,	1583591306,
                1583550756,	1583591306,
                1583637014,	1583677817,
                1583637014,	1583677817,
                1583637014,	1583677817,
                1583809530,	1583850838,
                1583895787,	1583937349,
                1584068299,	1584110368,
                1584154555,	1584196878,
                1584154555,	1584196878,
                1584154555,	1584196878,
                1584240811,	1584283387,
                1584327066,	1584369896,
                1584413321,	1584456405,
                1584413321,	1584456405,
                1584499576,	1584542913,
                1584585831,	1584629422,
                1584585831,	1584629422,
                1584672085,	1584715930,
                1584758340,	1584802438,
                1584758340,	1584802438,
                1584844594,	1584888946,
                1584844594,	1584888946,
                1584844594,	1584888946,
                1584930849,	1584975454,
                1585275867,	1585321484,
                1585275867,	1585321484,
                1585707143,	1585754021,
                1585793399,	1585840529,
                1585879655,	1585927036,
                1585965912,	1586013544,
                1586052169,	1586100051,
                1586052169,	1586100051,
                1586138426,	1586186559,
                1586224684,	1586273066,
                1586397202,	1586446082,
                1586483461,	1586532590,
                1586655983,	1586705605,
                1586742244,	1586792113,
                1586742244,	1586792113,
                1586828506,	1586878621,
                1586828506,	1586878621,
                1586914769,	1586965129,
                1586914769,	1586965129,
                1586914769,	1586965129,
                1587087298,	1587138146,
                1587259830,	1587311162,
                1587346097,	1587397670,
                1587432365,	1587484179,
                1587518634,	1587570687,
                1587691176,	1587743703,
                1587777449,	1587830211,
                1587863722,	1587916719,
                1587518634,	1587570687,
                1588208829,	1588262749,
                1588208829,	1588262749
        };



        for (int i =0; i < list.length; i=i+2) {
            long rise = list[i];
            long set = list[i+1];

            LocalDateTime sunriseTime = new LocalDateTime(rise * 1000);
            String sunriseTimeString = sunriseTime.toLocalTime().toString();
            sunriseTimeString = sunriseTimeString.split("\\.")[0];

            LocalDateTime sunsetTime = new LocalDateTime(set * 1000);
            String sunsetTimeString = sunsetTime.toLocalTime().toString();
            sunsetTimeString = sunsetTimeString.split("\\.")[0];

            System.out.println("i = " + i + "  -  rise = " + rise + " [ " + sunriseTimeString + " ]" + "  set = " + set + " [ " + sunsetTimeString + " ]");
        }



        System.out.println("-------------------------");



        moment = "1583119455";

        LocalDateTime sunriseTime = new LocalDateTime(1000 * Long.parseLong(moment));
        String sunriseTimeString = sunriseTime.toLocalTime().toString();
        sunriseTimeString = sunriseTimeString.split("\\.")[0];
        System.out.println("sunriseTimeString = " + sunriseTimeString + " at moment " + moment);

        moment = "1583158746";

        sunriseTime = new LocalDateTime(1000 * Long.parseLong(moment));
        sunriseTimeString = sunriseTime.toLocalTime().toString();
        sunriseTimeString = sunriseTimeString.split("\\.")[0];
        System.out.println("sunsetTimeString  = " + sunriseTimeString + " at moment " + moment);


        long end = System.currentTimeMillis();
        long time = end - current;
        System.out.println("time  = " + time + " ms");
    }

}
