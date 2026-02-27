package G7;

import M8.S;
import N5.C0466m;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.ViewGroupKt;
import b5.C0910b;
import b5.C0916h;
import bg.AbstractC0983W;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.domain.model.DosriValidationResult;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.KycSelectionItem;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.kyczoloz.utils.Name;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.settings.view.activity.impl.MayaAdsInternalOnlyActivity;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class F implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1826a;

    public /* synthetic */ F(int i) {
        this.f1826a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [ij.j, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z4 = false;
        switch (this.f1826a) {
            case 0:
                C0910b bannerItemVariables = (C0910b) obj;
                kotlin.jvm.internal.j.g(bannerItemVariables, "bannerItemVariables");
                yk.a.a();
                return Unit.f18162a;
            case 1:
                C0916h interstitialAdVariables = (C0916h) obj;
                kotlin.jvm.internal.j.g(interstitialAdVariables, "interstitialAdVariables");
                yk.a.a();
                return Unit.f18162a;
            case 2:
                C0916h interstitialAdVariables2 = (C0916h) obj;
                kotlin.jvm.internal.j.g(interstitialAdVariables2, "interstitialAdVariables");
                yk.a.a();
                return Unit.f18162a;
            case 3:
                C0916h interstitialAdVariables3 = (C0916h) obj;
                kotlin.jvm.internal.j.g(interstitialAdVariables3, "interstitialAdVariables");
                yk.a.a();
                return Unit.f18162a;
            case 4:
                C0916h interstitialAdVariables4 = (C0916h) obj;
                kotlin.jvm.internal.j.g(interstitialAdVariables4, "interstitialAdVariables");
                yk.a.a();
                return Unit.f18162a;
            case 5:
                C0910b bannerItemVariables2 = (C0910b) obj;
                kotlin.jvm.internal.j.g(bannerItemVariables2, "bannerItemVariables");
                yk.a.a();
                return Unit.f18162a;
            case 6:
                Cg.b createClientPlugin = (Cg.b) obj;
                kotlin.jvm.internal.j.g(createClientPlugin, "$this$createClientPlugin");
                createClientPlugin.a(Gg.b.f1971a, new Fg.k(createClientPlugin, ((Gg.g) createClientPlugin.f765b).f1977a, null));
                return Unit.f18162a;
            case 7:
                String it = (String) obj;
                kotlin.jvm.internal.j.g(it, "it");
                String strReplace = AbstractC1234x.f11258r.withLocale(AbstractC1234x.l()).print(AbstractC1234x.b(it)).replace("AM", "am").replace("PM", "pm");
                kotlin.jvm.internal.j.f(strReplace, "formatDateMayaUserActivityPurchaseDate(...)");
                return strReplace;
            case 8:
                String it2 = (String) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                String strReplace2 = AbstractC1234x.f11258r.withLocale(AbstractC1234x.l()).print(AbstractC1234x.b(it2)).replace("AM", "am").replace("PM", "pm");
                kotlin.jvm.internal.j.f(strReplace2, "formatDateMayaUserActivityPurchaseDate(...)");
                return strReplace2;
            case 9:
                Byte b8 = (Byte) obj;
                b8.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b8}, 1));
            case 10:
                C0910b bannerItemVariables3 = (C0910b) obj;
                kotlin.jvm.internal.j.g(bannerItemVariables3, "bannerItemVariables");
                yk.a.a();
                return Unit.f18162a;
            case 11:
                View view = (View) obj;
                kotlin.jvm.internal.j.g(view, "view");
                return view instanceof FrameLayout ? yj.n.f(yj.q.k(yj.q.h(ViewGroupKt.getChildren((ViewGroup) view), S.c))) : yj.n.f(view);
            case 12:
                MayaInputLayout it3 = (MayaInputLayout) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                if (it3.getVisibility() == 0 && it3.isEnabled() && (it3.getTag() instanceof KycFieldType)) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 13:
                MayaInputLayout it4 = (MayaInputLayout) obj;
                kotlin.jvm.internal.j.g(it4, "it");
                Object tag = it4.getTag();
                kotlin.jvm.internal.j.e(tag, "null cannot be cast to non-null type com.paymaya.domain.model.KycFieldType");
                return new Pair(it4, (KycFieldType) tag);
            case 14:
                kotlin.jvm.internal.j.g((Pair) obj, "<destruct>");
                return Boolean.valueOf(!kotlin.jvm.internal.j.b((DosriValidationResult) r0.f18161b, DosriValidationResult.Success.INSTANCE));
            case 15:
                View child = (View) obj;
                kotlin.jvm.internal.j.g(child, "child");
                C0466m c0466mA = C0466m.a(child);
                String strValueOf = String.valueOf(((MayaProfileInputLayout) c0466mA.f).getInputEditText().getText());
                String strValueOf2 = String.valueOf(((MayaProfileInputLayout) c0466mA.h).getInputEditText().getText());
                String strValueOf3 = String.valueOf(((MayaProfileInputLayout) c0466mA.f4152g).getInputEditText().getText());
                boolean zIsChecked = ((AppCompatCheckBox) c0466mA.c).isChecked();
                Object selectedData = ((MayaDropDown) c0466mA.e).getSelectedData();
                KycSelectionItem kycSelectionItem = selectedData instanceof KycSelectionItem ? (KycSelectionItem) selectedData : null;
                Name name = new Name(strValueOf, strValueOf2, strValueOf3, Boolean.valueOf(zIsChecked));
                String key = kycSelectionItem != null ? kycSelectionItem.getKey() : null;
                if (key == null) {
                    key = "";
                }
                return new Pair(name, key);
            case 16:
                kotlin.jvm.internal.j.g((KycFieldType) obj, "it");
                return Unit.f18162a;
            case 17:
                int i = NewMayaCreditActivity.f13081x;
                kotlin.jvm.internal.j.g((ActivityResult) obj, "it");
                return Unit.f18162a;
            case 18:
                int i4 = MayaAdsInternalOnlyActivity.f13830s;
                kotlin.jvm.internal.j.g((C0916h) obj, "<unused var>");
                return Unit.f18162a;
            case 19:
                int i6 = MayaAdsInternalOnlyActivity.f13830s;
                kotlin.jvm.internal.j.g((C0916h) obj, "<unused var>");
                return Unit.f18162a;
            case 20:
                Pair it5 = (Pair) obj;
                kotlin.jvm.internal.j.g(it5, "it");
                String str = (String) it5.f18160a;
                Object obj2 = it5.f18161b;
                if (obj2 == null) {
                    return str;
                }
                return str + '=' + String.valueOf(obj2);
            case 21:
                O.i it6 = (O.i) obj;
                kotlin.jvm.internal.j.g(it6, "it");
                StringBuilder sb2 = new StringBuilder("\t");
                sb2.append(it6.f4517a);
                sb2.append(" = ");
                Object obj3 = it6.c;
                if (obj3 == null) {
                    obj3 = it6.f4518b;
                }
                sb2.append(obj3);
                return sb2.toString();
            case 22:
                C0916h interstitialAdVariables5 = (C0916h) obj;
                kotlin.jvm.internal.j.g(interstitialAdVariables5, "interstitialAdVariables");
                yk.a.a();
                return Unit.f18162a;
            case 23:
                C0916h interstitialAdVariables6 = (C0916h) obj;
                kotlin.jvm.internal.j.g(interstitialAdVariables6, "interstitialAdVariables");
                yk.a.a();
                return Unit.f18162a;
            case 24:
                C0910b bannerItemVariables4 = (C0910b) obj;
                kotlin.jvm.internal.j.g(bannerItemVariables4, "bannerItemVariables");
                yk.a.a();
                return Unit.f18162a;
            case 25:
                C0910b bannerItemVariables5 = (C0910b) obj;
                kotlin.jvm.internal.j.g(bannerItemVariables5, "bannerItemVariables");
                yk.a.a();
                return Unit.f18162a;
            case 26:
                JSONObject inApp = (JSONObject) obj;
                kotlin.jvm.internal.j.g(inApp, "inApp");
                return Integer.valueOf(inApp.optInt("priority", 1));
            case 27:
                JSONObject inApp2 = (JSONObject) obj;
                kotlin.jvm.internal.j.g(inApp2, "inApp");
                return inApp2.optString("ti", String.valueOf(new Date().getTime() / ((long) 1000)));
            case 28:
                Map.Entry DelegatingMutableSet = (Map.Entry) obj;
                kotlin.jvm.internal.j.g(DelegatingMutableSet, "$this$DelegatingMutableSet");
                return new Rg.n(((Rg.i) DelegatingMutableSet.getKey()).f5538a, DelegatingMutableSet.getValue());
            default:
                Map.Entry DelegatingMutableSet2 = (Map.Entry) obj;
                kotlin.jvm.internal.j.g(DelegatingMutableSet2, "$this$DelegatingMutableSet");
                return new Rg.n(AbstractC0983W.f((String) DelegatingMutableSet2.getKey()), DelegatingMutableSet2.getValue());
        }
    }
}
