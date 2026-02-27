package dOYHB6.krwAC8;

import android.hardware.display.DisplayManager;
import android.view.Display;
import dOYHB6.nm8AQ4;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public class slgMP8 {
    public static Collection<Display> tFp7P6() {
        DisplayManager displayManager = (DisplayManager) nm8AQ4.get().getSystemService(numX49.tnTj78("bFjP"));
        if (displayManager == null) {
            return Collections.emptyList();
        }
        Display[] displays = displayManager.getDisplays();
        ArrayList arrayList = new ArrayList();
        for (Display display : displays) {
            if (display.getDisplayId() != 0) {
                arrayList.add(display);
            }
        }
        return arrayList;
    }
}
