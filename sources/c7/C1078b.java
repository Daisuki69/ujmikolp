package c7;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditEnhancedActivationFragment;
import defpackage.AbstractC1414e;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: c7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1078b extends AbstractC1082f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9297b;
    public final Boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9298d;
    public final NewMayaCreditEnhancedActivationFragment e;
    public final Drawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View.OnClickListener f9299g;

    public C1078b(String str, String str2, Boolean bool, String str3, NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment, Drawable drawable, View.OnClickListener onClickListener, int i) {
        str3 = (i & 256) != 0 ? null : str3;
        this.f9296a = str;
        this.f9297b = str2;
        this.c = bool;
        this.f9298d = str3;
        this.e = newMayaCreditEnhancedActivationFragment;
        this.f = drawable;
        this.f9299g = onClickListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1078b)) {
            return false;
        }
        C1078b c1078b = (C1078b) obj;
        return this.f9296a.equals(c1078b.f9296a) && this.f9297b.equals(c1078b.f9297b) && this.c.equals(c1078b.c) && j.b(this.f9298d, c1078b.f9298d) && this.e.equals(c1078b.e) && j.b(this.f, c1078b.f) && this.f9299g.equals(c1078b.f9299g);
    }

    public final int hashCode() {
        int iHashCode = (((this.c.hashCode() + AbstractC1414e.c(((this.f9296a.hashCode() * 31) + 1231) * 31, 31, this.f9297b)) * 961) + 1231) * 29791;
        String str = this.f9298d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 29791;
        Drawable drawable = this.f;
        return this.f9299g.hashCode() + ((iHashCode2 + (drawable != null ? drawable.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BasicReviewInfoUiModel(header=" + this.f9296a + ", headerEnable=true, value=" + this.f9297b + ", hint=" + this.c + ", badge=null, badgeEnabled=true, description=null, descriptionSecondary=null, actionText=" + this.f9298d + ", actionListener=" + this.e + ", actionTextSecondary=null, actionListenerSecondary=null, actionButtonDrawable=" + this.f + ", actionFieldListener=" + this.f9299g + ")";
    }
}
