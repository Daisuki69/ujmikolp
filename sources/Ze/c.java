package Ze;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import ch.l;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f6937b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U8.c f6938a;

    public c(FragmentActivity fragmentActivity) {
        this.f6938a = new U8.c(this, fragmentActivity.getSupportFragmentManager());
    }

    public static l a(c cVar, l lVar, String[] strArr) {
        l lVarJust;
        cVar.getClass();
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("RxPermissions.request/requestEach requires at least one input permission");
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            Object obj = f6937b;
            if (i >= length) {
                lVarJust = l.just(obj);
                break;
            }
            if (!cVar.f6938a.n().f15520B.containsKey(strArr[i])) {
                lVarJust = l.empty();
                break;
            }
            i++;
        }
        return l.merge(lVar, lVarJust).flatMap(new b(cVar, strArr, 2));
    }

    public final l b(String... strArr) {
        return l.just(f6937b).compose(new b(this, strArr, 0));
    }

    public final l c(String... strArr) {
        return l.just(f6937b).compose(new b(this, strArr, 1));
    }

    public c(Fragment fragment) {
        this.f6938a = new U8.c(this, fragment.getChildFragmentManager());
    }
}
