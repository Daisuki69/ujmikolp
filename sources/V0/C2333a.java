package v0;

import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.dynatrace.agent.events.enrichment.sanitation.AttributeSanitizer;
import com.dynatrace.agent.events.enrichment.sanitation.JsonAttribute;
import com.dynatrace.agent.events.enrichment.sanitation.JsonAttributeSanitationKt;
import com.google.android.gms.tasks.OnFailureListener;
import com.paymaya.domain.model.AccountUsage;
import com.paymaya.domain.model.FinancialDocument;
import com.paymaya.mayaui.inboxsupport.view.activity.impl.MayaInboxSupportActivity;
import kotlin.jvm.internal.j;
import w5.InterfaceC2384b;

/* JADX INFO: renamed from: v0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2333a implements AttributeSanitizer, OnApplyWindowInsetsListener, ActivityResultCallback, InterfaceC2384b, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20422a;

    public /* synthetic */ C2333a(int i) {
        this.f20422a = i;
    }

    @Override // w5.InterfaceC2384b
    public String b(Object obj) {
        String name;
        switch (this.f20422a) {
            case 3:
                return ((AccountUsage) obj).getName();
            default:
                FinancialDocument financialDocument = (FinancialDocument) obj;
                return (financialDocument == null || (name = financialDocument.getName()) == null) ? "" : name;
        }
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        ((Boolean) obj).getClass();
        int i = MayaInboxSupportActivity.f12415v;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View v7, WindowInsetsCompat windowInsets) {
        j.g(v7, "v");
        j.g(windowInsets, "windowInsets");
        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout() | WindowInsetsCompat.Type.ime());
        j.f(insets, "getInsets(...)");
        v7.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e) {
        j.g(e, "e");
        yk.a.e();
    }

    @Override // com.dynatrace.agent.events.enrichment.sanitation.AttributeSanitizer
    public JsonAttribute sanitize(JsonAttribute jsonAttribute) {
        return JsonAttributeSanitationKt.trimTooLongStringValues$lambda$7(jsonAttribute);
    }
}
