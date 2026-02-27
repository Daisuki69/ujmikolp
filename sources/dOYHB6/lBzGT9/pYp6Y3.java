package dOYHB6.lBzGT9;

import android.app.Activity;
import android.content.Context;
import dOYHB6.nI7sp1.atRoM5;
import dOYHB6.nm8AQ4;
import dOYHB6.tiZVw8.numX49;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class pYp6Y3 {
    static final String fQGRG3() {
        return numX49.tnTj78("bHyr");
    }

    public static String fz7rZ7(Activity activity) {
        return uVdQL2() ? yqRi20() : atRoM5.getString(v5kl57(), soGxN3(), fQGRG3());
    }

    static final String nn3f32() {
        return numX49.tnTj78("bHy2");
    }

    public static void requestPermissions(Activity activity, String[] strArr, int i) {
        try {
            Class.forName("androidx.core.app.ActivityCompat").getMethod("requestPermissions", Activity.class, String[].class, Integer.TYPE).invoke(null, activity, strArr, Integer.valueOf(i));
            List listAsList = Arrays.asList(strArr);
            if (listAsList.contains(numX49.tnTj78("bHyu")) || listAsList.contains(numX49.tnTj78("bHyV"))) {
                atRoM5.putString(v5kl57(), soGxN3(), uPSIF5());
                atRoM5.save(v5kl57());
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
        }
    }

    private static String soGxN3() {
        return numX49.tnTj78("bHyb");
    }

    private static boolean trFHL1(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    static final String uPSIF5() {
        return numX49.tnTj78("bHyZ");
    }

    public static boolean uVdQL2() {
        Context context = nm8AQ4.get();
        if (context == null) {
            return false;
        }
        return trFHL1(context, numX49.tnTj78("bHyk")) || trFHL1(context, numX49.tnTj78("bHyB"));
    }

    private static String v5kl57() {
        return numX49.tnTj78("bHyP");
    }

    static final String yqRi20() {
        return numX49.tnTj78("bHyL");
    }
}
