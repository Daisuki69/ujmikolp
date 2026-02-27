package androidx.media3.exoplayer.dash;

import O1.AbstractC0529x;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.dash.manifest.BaseUrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class BaseUrlExclusionList {
    private final Map<Integer, Long> excludedPriorities;
    private final Map<String, Long> excludedServiceLocations;
    private final Random random;
    private final Map<List<Pair<String, Integer>>, BaseUrl> selectionsTaken;

    public BaseUrlExclusionList() {
        this(new Random());
    }

    private static <T> void addExclusion(T t5, long j, Map<T, Long> map) {
        if (map.containsKey(t5)) {
            j = Math.max(j, ((Long) Util.castNonNull(map.get(t5))).longValue());
        }
        map.put(t5, Long.valueOf(j));
    }

    private List<BaseUrl> applyExclusions(List<BaseUrl> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        removeExpiredExclusions(jElapsedRealtime, this.excludedServiceLocations);
        removeExpiredExclusions(jElapsedRealtime, this.excludedPriorities);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            BaseUrl baseUrl = list.get(i);
            if (!this.excludedServiceLocations.containsKey(baseUrl.serviceLocation) && !this.excludedPriorities.containsKey(Integer.valueOf(baseUrl.priority))) {
                arrayList.add(baseUrl);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compareBaseUrl(BaseUrl baseUrl, BaseUrl baseUrl2) {
        int iCompare = Integer.compare(baseUrl.priority, baseUrl2.priority);
        return iCompare != 0 ? iCompare : baseUrl.serviceLocation.compareTo(baseUrl2.serviceLocation);
    }

    public static int getPriorityCount(List<BaseUrl> list) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            hashSet.add(Integer.valueOf(list.get(i).priority));
        }
        return hashSet.size();
    }

    private static <T> void removeExpiredExclusions(long j, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<T, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    private BaseUrl selectWeighted(List<BaseUrl> list) {
        int i = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i += list.get(i4).weight;
        }
        int iNextInt = this.random.nextInt(i);
        int i6 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            BaseUrl baseUrl = list.get(i10);
            i6 += baseUrl.weight;
            if (iNextInt < i6) {
                return baseUrl;
            }
        }
        return (BaseUrl) AbstractC0529x.k(list);
    }

    public void exclude(BaseUrl baseUrl, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        addExclusion(baseUrl.serviceLocation, jElapsedRealtime, this.excludedServiceLocations);
        int i = baseUrl.priority;
        if (i != Integer.MIN_VALUE) {
            addExclusion(Integer.valueOf(i), jElapsedRealtime, this.excludedPriorities);
        }
    }

    public int getPriorityCountAfterExclusion(List<BaseUrl> list) {
        HashSet hashSet = new HashSet();
        List<BaseUrl> listApplyExclusions = applyExclusions(list);
        for (int i = 0; i < listApplyExclusions.size(); i++) {
            hashSet.add(Integer.valueOf(listApplyExclusions.get(i).priority));
        }
        return hashSet.size();
    }

    public void reset() {
        this.excludedServiceLocations.clear();
        this.excludedPriorities.clear();
        this.selectionsTaken.clear();
    }

    @Nullable
    public BaseUrl selectBaseUrl(List<BaseUrl> list) {
        List<BaseUrl> listApplyExclusions = applyExclusions(list);
        if (listApplyExclusions.size() < 2) {
            return (BaseUrl) AbstractC0529x.j(null, listApplyExclusions);
        }
        Collections.sort(listApplyExclusions, new a());
        ArrayList arrayList = new ArrayList();
        int i = listApplyExclusions.get(0).priority;
        int i4 = 0;
        while (true) {
            if (i4 >= listApplyExclusions.size()) {
                break;
            }
            BaseUrl baseUrl = listApplyExclusions.get(i4);
            if (i == baseUrl.priority) {
                arrayList.add(new Pair(baseUrl.serviceLocation, Integer.valueOf(baseUrl.weight)));
                i4++;
            } else if (arrayList.size() == 1) {
                return listApplyExclusions.get(0);
            }
        }
        BaseUrl baseUrl2 = this.selectionsTaken.get(arrayList);
        if (baseUrl2 != null) {
            return baseUrl2;
        }
        BaseUrl baseUrlSelectWeighted = selectWeighted(listApplyExclusions.subList(0, arrayList.size()));
        this.selectionsTaken.put(arrayList, baseUrlSelectWeighted);
        return baseUrlSelectWeighted;
    }

    @VisibleForTesting
    public BaseUrlExclusionList(Random random) {
        this.selectionsTaken = new HashMap();
        this.random = random;
        this.excludedServiceLocations = new HashMap();
        this.excludedPriorities = new HashMap();
    }
}
