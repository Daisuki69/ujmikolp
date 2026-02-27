package dOYHB6.oNEjN0;

import android.util.Pair;
import android.view.MotionEvent;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.qOnQ39.qOnQ39;
import dOYHB6.speLp8.fChUQ4;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class g0IbM3 {
    private static final List<Pair<Float, Float>> lastCoordinates = new ArrayList();
    private static final List<Boolean> lastActionMoves = new ArrayList();
    private static int LAST_COORDINATES_MAX_SIZE = 50;
    private static int REPEATING_COORDINATES_THRESHOLD = 15;
    private static boolean sent_click_bot_clicks_event = false;
    private static boolean isAdConfigPatternsInitiated = false;

    private static void asPDs5() {
        if (isAdConfigPatternsInitiated) {
            return;
        }
        LAST_COORDINATES_MAX_SIZE = qOnQ39.getInt(numX49.tnTj78("bHYZ"), LAST_COORDINATES_MAX_SIZE);
        REPEATING_COORDINATES_THRESHOLD = qOnQ39.getInt(numX49.tnTj78("bHYk"), REPEATING_COORDINATES_THRESHOLD);
        isAdConfigPatternsInitiated = true;
    }

    private static String crfJU2(MotionEvent motionEvent) {
        asPDs5();
        HashMap map = new HashMap();
        Pair<Float, Float> pair = new Pair<>(Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()));
        boolean z4 = false;
        Boolean boolValueOf = Boolean.valueOf(motionEvent.getAction() == 2);
        lastActionMoves.add(boolValueOf);
        lastCoordinates.add(pair);
        if (lastCoordinates.size() > LAST_COORDINATES_MAX_SIZE) {
            lastCoordinates.remove(0);
        }
        lastActionMoves.add(boolValueOf);
        if (lastActionMoves.size() > LAST_COORDINATES_MAX_SIZE) {
            lastActionMoves.remove(0);
        }
        int i = 0;
        for (Pair<Float, Float> pair2 : lastCoordinates) {
            int iIntValue = map.containsKey(pair2) ? ((Integer) map.get(pair2)).intValue() + 1 : 1;
            if (iIntValue >= REPEATING_COORDINATES_THRESHOLD) {
                lastCoordinates.clear();
                z4 = true;
            }
            map.put(pair2, Integer.valueOf(iIntValue));
            i = iIntValue;
        }
        String strTnTj78 = numX49.tnTj78("bHYP");
        return (z4 && !lastActionMoves.contains(true)) ? numX49.tnTj78("bHYb") + i + numX49.tnTj78("bHY2") : strTnTj78;
    }

    public static void gSVOV1(eTp7v2 etp7v2) {
        if (sent_click_bot_clicks_event) {
            return;
        }
        String strCrfJU2 = crfJU2(etp7v2.getMotionEvent());
        if (strCrfJU2.isEmpty()) {
            return;
        }
        sent_click_bot_clicks_event = true;
        fChUQ4.zJGTn5(numX49.tnTj78("bHYr"), numX49.tnTj78("bHYL"), strCrfJU2);
    }
}
