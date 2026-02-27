package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SurfaceCombination {
    private final List<SurfaceConfig> mSurfaceConfigList = new ArrayList();

    private static void generateArrangements(List<int[]> list, int i, int[] iArr, int i4) {
        if (i4 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i6 = 0; i6 < i; i6++) {
            int i10 = 0;
            while (true) {
                if (i10 >= i4) {
                    iArr[i4] = i6;
                    generateArrangements(list, i, iArr, i4 + 1);
                    break;
                } else if (i6 == iArr[i10]) {
                    break;
                } else {
                    i10++;
                }
            }
        }
    }

    private List<int[]> getElementsArrangements(int i) {
        ArrayList arrayList = new ArrayList();
        generateArrangements(arrayList, i, new int[i], 0);
        return arrayList;
    }

    public boolean addSurfaceConfig(@NonNull SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.add(surfaceConfig);
    }

    @Nullable
    public List<SurfaceConfig> getOrderedSupportedSurfaceConfigList(@NonNull List<SurfaceConfig> list) {
        int i;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.mSurfaceConfigList.size()) {
            return null;
        }
        List<int[]> elementsArrangements = getElementsArrangements(this.mSurfaceConfigList.size());
        SurfaceConfig[] surfaceConfigArr = new SurfaceConfig[list.size()];
        Iterator<int[]> it = elementsArrangements.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            int[] next = it.next();
            boolean zIsSupported = true;
            while (i < this.mSurfaceConfigList.size()) {
                if (next[i] < list.size()) {
                    zIsSupported &= this.mSurfaceConfigList.get(i).isSupported(list.get(next[i]));
                    if (!zIsSupported) {
                        break;
                    }
                    surfaceConfigArr[next[i]] = this.mSurfaceConfigList.get(i);
                }
                i++;
            }
            if (zIsSupported) {
                i = 1;
                break;
            }
        }
        if (i != 0) {
            return Arrays.asList(surfaceConfigArr);
        }
        return null;
    }

    @NonNull
    public List<SurfaceConfig> getSurfaceConfigList() {
        return this.mSurfaceConfigList;
    }

    public boolean removeSurfaceConfig(@NonNull SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.remove(surfaceConfig);
    }
}
