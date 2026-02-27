package G5;

import Bj.C0149k;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: G5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0255e extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EditText f1731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0149k f1732b;

    public C0255e(EditText editText, C0149k c0149k) {
        this.f1731a = editText;
        this.f1732b = c0149k;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View host, int i) {
        kotlin.jvm.internal.j.g(host, "host");
        super.sendAccessibilityEvent(host, i);
        if (i == 8192) {
            EditText editText = this.f1731a;
            this.f1732b.invoke(editText, Integer.valueOf(editText.getSelectionStart()), Integer.valueOf(editText.getSelectionEnd()));
        }
    }
}
