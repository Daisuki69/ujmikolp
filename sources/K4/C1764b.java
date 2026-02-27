package k4;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import ch.r;
import dh.AbstractC1402a;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: k4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1764b extends AbstractC1402a implements TextWatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18110b = 1;
    public final r c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f18111d;

    public C1764b(TextView view, r observer) {
        j.h(view, "view");
        j.h(observer, "observer");
        this.f18111d = view;
        this.c = observer;
    }

    @Override // dh.AbstractC1402a
    public final void a() {
        switch (this.f18110b) {
            case 0:
                ((AppCompatEditText) this.f18111d).removeTextChangedListener(this);
                break;
            default:
                this.f18111d.removeTextChangedListener(this);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s9) {
        switch (this.f18110b) {
            case 0:
                j.h(s9, "s");
                this.c.onNext(new C1763a((AppCompatEditText) this.f18111d, s9));
                break;
            default:
                j.h(s9, "s");
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        switch (this.f18110b) {
            case 0:
                j.h(charSequence, "charSequence");
                break;
            default:
                j.h(charSequence, "s");
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        switch (this.f18110b) {
            case 0:
                j.h(charSequence, "charSequence");
                break;
            default:
                j.h(charSequence, "s");
                if (!this.f16510a.get()) {
                    this.c.onNext(charSequence);
                }
                break;
        }
    }

    public C1764b(AppCompatEditText view, r observer) {
        j.h(view, "view");
        j.h(observer, "observer");
        this.f18111d = view;
        this.c = observer;
    }
}
