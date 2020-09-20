import com.home.GetWeather;
import org.joda.time.LocalDateTime;
import org.junit.Test;


public class Converter {

    @Test
    public void convertLongToTime() {

        long current = System.currentTimeMillis();

        String moment;

        long[] list = {
                1589848435,	1589906288,
                1589934749,	1589992780,
                1590021067,	1590079272,
                1590107386,	1590165762,
                1590193708,	1590252251,
                1590280033,	1590338738,
                1590280033,	1590338738,
                1590280033,	1590338738,
                1590366360,	1590425223,
                1590539022,	1590598188  };

        for (int i =0; i < list.length; i=i+2) {
            long rise = list[i];
            long set = list[i+1];


            String length = getDayLength(set -rise);
            System.out.println("i = " + i + "  -  length = " + length);
/*
            LocalDateTime sunriseTime = new LocalDateTime(rise * 1000);
            String sunriseTimeString = sunriseTime.toLocalTime().toString();
            sunriseTimeString = sunriseTimeString.split("\\.")[0];

            LocalDateTime sunsetTime = new LocalDateTime(set * 1000);
            String sunsetTimeString = sunsetTime.toLocalTime().toString();
            sunsetTimeString = sunsetTimeString.split("\\.")[0];

            System.out.println("i = " + i + "  -  rise = " + rise + " [ " + sunriseTimeString + " ]" + "  set = " + set + " [ " + sunsetTimeString + " ]");
            */
        }


        System.out.println("-------------------------");


        LocalDateTime sunriseTime;
        String sunriseTimeString;

        moment = "1583119455";

        sunriseTime = new LocalDateTime(1000 * Long.parseLong(moment));
        sunriseTimeString = sunriseTime.toLocalTime().toString();
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


    @Test
    public void test() {
        GetWeather getWeather = new GetWeather();
        System.out.println("wind: " + getWeather.getWindDirection("360"));
    }

    public String getDayLength(Long seconds){
        return (seconds / 3600) + "h " + ((seconds % 3600) / 60) + "m " + (seconds % 60) + "s";
    }

}
