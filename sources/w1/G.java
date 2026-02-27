package w1;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.dynatrace.android.agent.Global;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import u1.C2292a;
import z1.AbstractC2550e;

/* JADX INFO: loaded from: classes2.dex */
public final class G extends FrameLayout implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2364b f20520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f20521b;
    public List c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2292a f20522d;
    public float e;

    public G(Context context) {
        super(context, null);
        this.c = Collections.EMPTY_LIST;
        this.f20522d = C2292a.e;
        this.e = 0.0533f;
        C2364b c2364b = new C2364b(context, null);
        this.f20520a = c2364b;
        F f = new F(context, null);
        this.f20521b = f;
        f.setBackgroundColor(0);
        addView(c2364b);
        addView(f);
    }

    @Override // w1.B
    public final void a(List list, C2292a c2292a, float f, float f3) {
        this.f20522d = c2292a;
        this.e = f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list.size() > 0) {
            list.get(0).getClass();
            throw new ClassCastException();
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            b();
        }
        this.f20520a.a(arrayList, c2292a, f, f3);
        invalidate();
    }

    public final void b() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String strY = jk.b.y(this.f20522d.f20255a);
        float f = this.e;
        getHeight();
        float height = f == -3.4028235E38f ? -3.4028235E38f : f * ((getHeight() - getPaddingTop()) - getPaddingBottom());
        String strConcat = "unset";
        if (height == -3.4028235E38f) {
            str = "unset";
        } else {
            Object[] objArr = {Float.valueOf(height / getContext().getResources().getDisplayMetrics().density)};
            int i = AbstractC2550e.f21351a;
            str = String.format(Locale.US, "%.2fpx", objArr);
        }
        Float fValueOf = Float.valueOf(1.2f);
        C2292a c2292a = this.f20522d;
        int i4 = c2292a.c;
        int i6 = c2292a.f20257d;
        if (i4 == 1) {
            Object[] objArr2 = {jk.b.y(i6)};
            int i10 = AbstractC2550e.f21351a;
            strConcat = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr2);
        } else if (i4 == 2) {
            String strY2 = jk.b.y(i6);
            int i11 = AbstractC2550e.f21351a;
            Locale locale = Locale.US;
            strConcat = "0.1em 0.12em 0.15em ".concat(strY2);
        } else if (i4 == 3) {
            String strY3 = jk.b.y(i6);
            int i12 = AbstractC2550e.f21351a;
            Locale locale2 = Locale.US;
            strConcat = "0.06em 0.08em 0.15em ".concat(strY3);
        } else if (i4 == 4) {
            String strY4 = jk.b.y(i6);
            int i13 = AbstractC2550e.f21351a;
            Locale locale3 = Locale.US;
            strConcat = "-0.05em -0.05em 0.15em ".concat(strY4);
        }
        int i14 = AbstractC2550e.f21351a;
        sb2.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2fem;text-shadow:%s;'>", strY, str, fValueOf, strConcat));
        HashMap map = new HashMap();
        map.put(".default_bg,.default_bg *", "background-color:" + jk.b.y(this.f20522d.f20256b) + Global.SEMICOLON);
        if (this.c.size() > 0) {
            this.c.get(0).getClass();
            throw new ClassCastException();
        }
        sb2.append("</div></body></html>");
        StringBuilder sb3 = new StringBuilder("<html><head><style>");
        for (String str2 : map.keySet()) {
            sb3.append(str2);
            sb3.append("{");
            sb3.append((String) map.get(str2));
            sb3.append("}");
        }
        sb3.append("</style></head>");
        sb2.insert(0, sb3.toString());
        this.f20521b.loadData(Base64.encodeToString(sb2.toString().getBytes(N1.e.c), 1), "text/html", "base64");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i4, int i6, int i10) {
        super.onLayout(z4, i, i4, i6, i10);
        if (!z4 || this.c.isEmpty()) {
            return;
        }
        b();
    }
}
