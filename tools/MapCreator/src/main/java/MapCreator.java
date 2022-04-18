import java.awt.*;
import java.awt.geom.Point2D;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class MapCreator {


    public static void main(String[] args) {
        JSONObject pointFile = new JSONObject();
        JSONArray xPoints = new JSONArray();
        JSONArray yPoints = new JSONArray();
        Point2D.Double lastPoint = new Point2D.Double(0, 0);

        double y = 0;
        double x = 0;

        while (x < 1080) {
            for (x = lastPoint.getX(); lastPoint.distance(new Point2D.Double(x, y)) < 0.5; x += 0.001) {
                y = Math.sin(x / 120) * 480;
            }
            lastPoint = new Point2D.Double(x, y);

            xPoints.add(x);
            yPoints.add(y);
        }
        pointFile.put("x", xPoints);
        pointFile.put("y", yPoints);

        try {
            FileWriter f = new FileWriter("points.json");
            f.write(pointFile.toJSONString());
            f.flush();
            f.close();
        } catch (IOException ex) {

        }


    }

}
