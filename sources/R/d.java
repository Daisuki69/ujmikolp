package R;

import D.d0;
import cj.C1112C;
import cj.M;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f5406b;
    public final List c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5407d;
    public final Object e;

    public d(String str, HashMap map, ArrayList arrayList, String str2, int i) {
        List list = (i & 4) != 0 ? C1112C.f9377a : arrayList;
        String str3 = (i & 16) != 0 ? null : str2;
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bPuPF"));
        kotlin.jvm.internal.j.g(list, numX49.tnTj78("bPuPH"));
        this.f5405a = str;
        this.f5406b = map;
        this.c = list;
        this.f5407d = str3;
        String strTnTj78 = numX49.tnTj78("bPuPO");
        String strTnTj782 = numX49.tnTj78("bPuPQ");
        Pair pair = new Pair(strTnTj78, strTnTj782);
        Pair pair2 = new Pair(numX49.tnTj78("bPuPt"), strTnTj782);
        String strTnTj783 = numX49.tnTj78("bPuPU");
        String strTnTj784 = numX49.tnTj78("bPuPe");
        Pair pair3 = new Pair(strTnTj783, strTnTj784);
        Pair pair4 = new Pair(numX49.tnTj78("bPuP8"), strTnTj784);
        String strTnTj785 = numX49.tnTj78("bPuPC");
        String strTnTj786 = numX49.tnTj78("bPuP4");
        Pair pair5 = new Pair(strTnTj785, strTnTj786);
        Pair pair6 = new Pair(numX49.tnTj78("bPuPo"), strTnTj786);
        String strTnTj787 = numX49.tnTj78("bPuPK");
        String strTnTj788 = numX49.tnTj78("bPuPw");
        Pair pair7 = new Pair(strTnTj787, strTnTj788);
        Pair pair8 = new Pair(numX49.tnTj78("bPuPc"), strTnTj788);
        String strTnTj789 = numX49.tnTj78("bPuPm");
        String strTnTj7810 = numX49.tnTj78("bPuPD");
        Pair pair9 = new Pair(strTnTj789, strTnTj7810);
        Pair pair10 = new Pair(numX49.tnTj78("bPuPh"), strTnTj7810);
        String strTnTj7811 = numX49.tnTj78("bPuPM");
        String strTnTj7812 = numX49.tnTj78("bPuPN");
        Pair pair11 = new Pair(strTnTj7811, strTnTj7812);
        Pair pair12 = new Pair(numX49.tnTj78("bPuP6"), strTnTj7812);
        String strTnTj7813 = numX49.tnTj78("bPuPa");
        String strTnTj7814 = numX49.tnTj78("bPuPX");
        Pair pair13 = new Pair(strTnTj7813, strTnTj7814);
        Pair pair14 = new Pair(numX49.tnTj78("bPuPG"), strTnTj7814);
        Pair pair15 = new Pair(numX49.tnTj78("bPuP3"), "wifi");
        Pair pair16 = new Pair(numX49.tnTj78("bPuPy"), "wifi");
        String strTnTj7815 = numX49.tnTj78("bPuPv");
        String strTnTj7816 = numX49.tnTj78("bPuP7");
        Pair pair17 = new Pair(strTnTj7815, strTnTj7816);
        Pair pair18 = new Pair(numX49.tnTj78("bPuPA"), strTnTj7816);
        String strTnTj7817 = numX49.tnTj78("bPuPY");
        String strTnTj7818 = numX49.tnTj78("bPuPT");
        this.e = M.h(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, new Pair(strTnTj7817, strTnTj7818), new Pair(numX49.tnTj78("bPuPR"), strTnTj7818), new Pair(numX49.tnTj78("bPuPp"), numX49.tnTj78("bPuP0")));
    }

    public final Object a(String str) {
        HashMap map = this.f5406b;
        Object obj = map.get(str);
        if (obj == null) {
            obj = map.get(d0.g(str));
        }
        if (obj != null) {
            return obj;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Pair(d0.g((String) entry.getKey()), entry.getValue()));
        }
        return M.l(arrayList).get(d0.g(str));
    }
}
