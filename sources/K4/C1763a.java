package k4;

import android.text.Editable;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: k4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1763a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatEditText f18108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Editable f18109b;

    public C1763a(AppCompatEditText view, Editable editable) {
        j.h(view, "view");
        this.f18108a = view;
        this.f18109b = editable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1763a)) {
            return false;
        }
        C1763a c1763a = (C1763a) obj;
        return j.b(this.f18108a, c1763a.f18108a) && j.b(this.f18109b, c1763a.f18109b);
    }

    public final int hashCode() {
        AppCompatEditText appCompatEditText = this.f18108a;
        int iHashCode = (appCompatEditText != null ? appCompatEditText.hashCode() : 0) * 31;
        Editable editable = this.f18109b;
        return iHashCode + (editable != null ? editable.hashCode() : 0);
    }

    public final String toString() {
        return "TextViewAfterTextChangeEvent(view=" + this.f18108a + ", editable=" + ((Object) this.f18109b) + ")";
    }
}
