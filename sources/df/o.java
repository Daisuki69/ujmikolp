package df;

import android.database.Cursor;
import android.util.Base64;
import android.view.View;
import com.dynatrace.agent.events.enrichment.sanitation.AttributeRetentionRule;
import com.dynatrace.agent.events.enrichment.sanitation.AttributeSanitizer;
import com.dynatrace.agent.events.enrichment.sanitation.JsonAttribute;
import com.dynatrace.agent.events.enrichment.sanitation.JsonAttributeSanitationKt;
import com.google.firebase.datatransport.TransportRegistrar;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import j1.InterfaceC1657e;
import java.nio.charset.Charset;
import java.util.ArrayList;
import k2.P0;
import m1.AbstractC1844a;
import o2.C1956a;
import v5.C2342a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements InterfaceC1657e, Z0.f, Ch.f, YtLogger.IYtLoggerListener, b2.c, ug.c, AttributeRetentionRule, AttributeSanitizer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f16462b = new o(0, (byte) 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16463a;

    @Override // ug.c
    public boolean a(View view) {
        return view.hasFocus();
    }

    @Override // j1.InterfaceC1657e
    public Object apply(Object obj) {
        switch (this.f16463a) {
            case 2:
                Cursor cursor = (Cursor) obj;
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null backendName");
                    }
                    Z0.e eVarB = AbstractC1844a.b(cursor.getInt(2));
                    String string2 = cursor.getString(3);
                    arrayList.add(new c1.i(string, string2 == null ? null : Base64.decode(string2, 0), eVarB));
                }
                return arrayList;
            case 16:
                C1956a.f18760b.getClass();
                return l2.a.f18226a.a((P0) obj).getBytes(Charset.forName("UTF-8"));
            default:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                return new C2342a(null);
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.common.YtLogger.IYtLoggerListener
    public void log(String str, String str2) {
        com.tencent.could.huiyansdk.helper.b.a(str, str2);
    }

    @Override // com.dynatrace.agent.events.enrichment.sanitation.AttributeSanitizer
    public JsonAttribute sanitize(JsonAttribute jsonAttribute) {
        switch (this.f16463a) {
            case 27:
                return JsonAttributeSanitationKt.removeNestedJsonObjectAndArrays$lambda$4(jsonAttribute);
            case 28:
                return JsonAttributeSanitationKt.removeAttributeWithExceedingKeySize$lambda$5(jsonAttribute);
            default:
                return JsonAttributeSanitationKt.removeAttributesWithInvalidKeys$lambda$6(jsonAttribute);
        }
    }

    @Override // com.dynatrace.agent.events.enrichment.sanitation.AttributeRetentionRule
    public boolean shouldKeep(JsonAttribute jsonAttribute) {
        switch (this.f16463a) {
            case 23:
                return JsonAttributeSanitationKt.sessionPropertiesNamespace$lambda$0(jsonAttribute);
            case 24:
                return JsonAttributeSanitationKt.eventPropertiesNamespace$lambda$1(jsonAttribute);
            case 25:
                return JsonAttributeSanitationKt.fieldsAllowedInGenerationApi$lambda$2(jsonAttribute);
            default:
                return JsonAttributeSanitationKt.fieldsAllowedInModificationApi$lambda$3(jsonAttribute);
        }
    }

    @Override // b2.c
    public Object v(Xh.b bVar) {
        switch (this.f16463a) {
            case 19:
                return TransportRegistrar.lambda$getComponents$0(bVar);
            case 20:
                return TransportRegistrar.lambda$getComponents$1(bVar);
            default:
                return TransportRegistrar.lambda$getComponents$2(bVar);
        }
    }

    public /* synthetic */ o(int i, byte b8) {
        this.f16463a = i;
    }
}
