package Ze;

import N4.d;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import ch.l;
import ch.q;
import com.tbruyelle.rxpermissions2.RxPermissionsFragment;
import hh.n;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements q, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String[] f6936b;
    public final /* synthetic */ c c;

    public /* synthetic */ b(c cVar, String[] strArr, int i) {
        this.f6935a = i;
        this.c = cVar;
        this.f6936b = strArr;
    }

    @Override // ch.q
    public l O(l lVar) {
        switch (this.f6935a) {
            case 0:
                return c.a(this.c, lVar, this.f6936b);
            default:
                c cVar = this.c;
                String[] strArr = this.f6936b;
                return c.a(cVar, lVar, strArr).buffer(strArr.length).flatMap(new d(20));
        }
    }

    @Override // hh.n
    public Object apply(Object obj) {
        c cVar = this.c;
        cVar.getClass();
        String[] strArr = this.f6936b;
        ArrayList arrayList = new ArrayList(strArr.length);
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        int i = 0;
        while (true) {
            U8.c cVar2 = cVar.f6938a;
            if (i >= length) {
                if (!arrayList2.isEmpty()) {
                    String[] strArr2 = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    RxPermissionsFragment rxPermissionsFragmentN = cVar2.n();
                    TextUtils.join(", ", strArr2);
                    rxPermissionsFragmentN.getClass();
                    cVar2.n().requestPermissions(strArr2, 42);
                }
                return l.concat(l.fromIterable(arrayList));
            }
            String str = strArr[i];
            cVar2.n().getClass();
            FragmentActivity activity = cVar2.n().getActivity();
            if (activity == null) {
                throw new IllegalStateException("This fragment must be attached to an activity.");
            }
            if (activity.checkSelfPermission(str) == 0) {
                arrayList.add(l.just(new a(str, true, false)));
            } else {
                RxPermissionsFragment rxPermissionsFragmentN2 = cVar2.n();
                FragmentActivity activity2 = rxPermissionsFragmentN2.getActivity();
                if (activity2 == null) {
                    throw new IllegalStateException("This fragment must be attached to an activity.");
                }
                if (activity2.getPackageManager().isPermissionRevokedByPolicy(str, rxPermissionsFragmentN2.getActivity().getPackageName())) {
                    arrayList.add(l.just(new a(str, false, false)));
                } else {
                    Wh.b bVar = (Wh.b) cVar2.n().f15520B.get(str);
                    if (bVar == null) {
                        arrayList2.add(str);
                        bVar = new Wh.b();
                        cVar2.n().f15520B.put(str, bVar);
                    }
                    arrayList.add(bVar);
                }
            }
            i++;
        }
    }
}
