package y9;

import N5.G0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.paymaya.R;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import qj.n;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a extends i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21081a = new a(3, G0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentMfaFaceAuthBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_mfa_face_auth, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        if (viewInflate != null) {
            return new G0((ConstraintLayout) viewInflate, 0);
        }
        throw new NullPointerException("rootView");
    }
}
