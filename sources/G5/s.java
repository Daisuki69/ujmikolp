package G5;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.paymaya.common.widget.HtmlTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ URLSpan f1765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1766b;
    public final /* synthetic */ HtmlTextView c;

    public s(HtmlTextView htmlTextView, URLSpan uRLSpan, String str) {
        this.c = htmlTextView;
        this.f1765a = uRLSpan;
        this.f1766b = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        HtmlTextView htmlTextView = this.c;
        t tVar = htmlTextView.f11270a;
        if (tVar != null) {
            boolean z4 = htmlTextView.c;
            URLSpan uRLSpan = this.f1765a;
            if (z4 && (tVar instanceof u)) {
                ((u) tVar).H(uRLSpan.getURL(), this.f1766b);
            } else {
                tVar.m(uRLSpan.getURL(), view);
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.c.f11271b);
    }
}
