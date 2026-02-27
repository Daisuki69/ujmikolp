package androidx.camera.core.processing;

import We.s;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class TargetUtils {
    private TargetUtils() {
    }

    public static void checkSupportedTargets(@NonNull Collection<Integer> collection, int i) {
        boolean zContains = collection.contains(Integer.valueOf(i));
        Locale locale = Locale.US;
        Preconditions.checkArgument(zContains, s.l("Effects target ", getHumanReadableName(i), " is not in the supported list ", getHumanReadableNames(collection), "."));
    }

    @NonNull
    public static String getHumanReadableName(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) "|");
            }
        }
        return sb2.toString();
    }

    @NonNull
    private static String getHumanReadableNames(@NonNull Collection<Integer> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(getHumanReadableName(it.next().intValue()));
        }
        StringBuilder sb2 = new StringBuilder("[");
        StringBuilder sb3 = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb3.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sb3.append((CharSequence) ", ");
            }
        }
        sb2.append(sb3.toString());
        sb2.append("]");
        return sb2.toString();
    }

    public static int getNumberOfTargets(int i) {
        int i4 = 0;
        while (i != 0) {
            i4 += i & 1;
            i >>= 1;
        }
        return i4;
    }

    public static boolean isSuperset(int i, int i4) {
        return (i & i4) == i4;
    }
}
