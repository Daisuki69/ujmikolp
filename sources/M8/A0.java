package M8;

import Ng.C0496d;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.animation.AlphaAnimation;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.webkit.ProxyConfig;
import bf.InterfaceC0950c;
import cj.C1110A;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mastercard.mpqr.pushpayment.exception.UnknownTagException;
import com.paymaya.domain.model.AccountLimitAmount;
import com.paymaya.domain.model.AccountLimitCount;
import com.paymaya.domain.model.AccountLimitType;
import com.paymaya.domain.model.AccountLimits;
import com.paymaya.domain.model.Amount;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditFragment;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.ktor.http.BadContentTypeFormatException;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C1790e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xj.InterfaceC2488d;
import zj.C2576A;
import zj.C2581c;

/* JADX INFO: loaded from: classes4.dex */
public abstract class A0 implements InterfaceC0950c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String[] f3132b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3133a;

    public /* synthetic */ A0(int i) {
        this.f3133a = i;
    }

    public static final boolean c(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (kotlin.jvm.internal.j.i(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    public static final JSONObject d(AccountLimits accountLimits) {
        String str;
        String str2;
        AccountLimitType accountLimitType;
        JSONObject jSONObject;
        String str3;
        String str4;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5 = new JSONObject();
        List<AccountLimitType> listMAccountLimitTypesDaily = accountLimits.mAccountLimitTypesDaily();
        kotlin.jvm.internal.j.f(listMAccountLimitTypesDaily, "mAccountLimitTypesDaily(...)");
        List<AccountLimitType> list = listMAccountLimitTypesDaily;
        ArrayList arrayList = new ArrayList(cj.t.l(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            str = "count";
            str2 = "description";
            if (!it.hasNext()) {
                break;
            }
            AccountLimitType accountLimitType2 = (AccountLimitType) it.next();
            JSONObject jSONObject6 = new JSONObject();
            try {
                jSONObject6.put(SessionDescription.ATTR_TYPE, accountLimitType2.mType());
            } catch (JSONException unused) {
                yk.a.e();
            }
            try {
                jSONObject6.put(AppMeasurementSdk.ConditionalUserProperty.NAME, accountLimitType2.mName());
            } catch (JSONException unused2) {
                yk.a.e();
            }
            try {
                jSONObject6.put("description", accountLimitType2.mDescription());
            } catch (JSONException unused3) {
                yk.a.e();
            }
            try {
                jSONObject6.put("order", accountLimitType2.mOrder());
            } catch (JSONException unused4) {
                yk.a.e();
            }
            AccountLimitCount accountLimitCountMCount = accountLimitType2.mCount();
            if (accountLimitCountMCount != null) {
                jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("limit", accountLimitCountMCount.mLimit());
                } catch (JSONException unused5) {
                    yk.a.e();
                }
                try {
                    jSONObject3.put("remaining", accountLimitCountMCount.mRemaining());
                } catch (JSONException unused6) {
                    yk.a.e();
                }
            } else {
                jSONObject3 = null;
            }
            try {
                jSONObject6.put("count", jSONObject3);
            } catch (JSONException unused7) {
                yk.a.e();
            }
            AccountLimitAmount accountLimitAmountMAmount = accountLimitType2.mAmount();
            if (accountLimitAmountMAmount != null) {
                jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("limit", accountLimitAmountMAmount.mLimit());
                } catch (JSONException unused8) {
                    yk.a.e();
                }
                try {
                    jSONObject4.put("remaining", accountLimitAmountMAmount.mRemaining());
                } catch (JSONException unused9) {
                    yk.a.e();
                }
                try {
                    jSONObject4.put("currency", accountLimitAmountMAmount.mCurrency());
                } catch (JSONException unused10) {
                    yk.a.e();
                }
            } else {
                jSONObject4 = null;
            }
            try {
                jSONObject6.put("amount", jSONObject4);
            } catch (JSONException unused11) {
                yk.a.e();
            }
            arrayList.add(jSONObject6);
        }
        try {
            jSONObject5.put("daily", new JSONArray((Collection) arrayList));
        } catch (JSONException unused12) {
            yk.a.e();
        }
        List<AccountLimitType> listMAccountLimitTypesMonthly = accountLimits.mAccountLimitTypesMonthly();
        kotlin.jvm.internal.j.f(listMAccountLimitTypesMonthly, "mAccountLimitTypesMonthly(...)");
        List<AccountLimitType> list2 = listMAccountLimitTypesMonthly;
        ArrayList arrayList2 = new ArrayList(cj.t.l(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            AccountLimitType accountLimitType3 = (AccountLimitType) it2.next();
            JSONObject jSONObject7 = new JSONObject();
            try {
                jSONObject7.put(SessionDescription.ATTR_TYPE, accountLimitType3.mType());
            } catch (JSONException unused13) {
                yk.a.e();
            }
            try {
                jSONObject7.put(AppMeasurementSdk.ConditionalUserProperty.NAME, accountLimitType3.mName());
            } catch (JSONException unused14) {
                yk.a.e();
            }
            try {
                jSONObject7.put(str2, accountLimitType3.mDescription());
            } catch (JSONException unused15) {
                yk.a.e();
            }
            try {
                jSONObject7.put("order", accountLimitType3.mOrder());
            } catch (JSONException unused16) {
                yk.a.e();
            }
            AccountLimitCount accountLimitCountMCount2 = accountLimitType3.mCount();
            Iterator it3 = it2;
            if (accountLimitCountMCount2 != null) {
                jSONObject = new JSONObject();
                accountLimitType = accountLimitType3;
                try {
                    jSONObject.put("limit", accountLimitCountMCount2.mLimit());
                } catch (JSONException unused17) {
                    yk.a.e();
                }
                try {
                    jSONObject.put("remaining", accountLimitCountMCount2.mRemaining());
                } catch (JSONException unused18) {
                    yk.a.e();
                }
            } else {
                accountLimitType = accountLimitType3;
                jSONObject = null;
            }
            try {
                jSONObject7.put(str, jSONObject);
            } catch (JSONException unused19) {
                yk.a.e();
            }
            AccountLimitAmount accountLimitAmountMAmount2 = accountLimitType.mAmount();
            if (accountLimitAmountMAmount2 != null) {
                jSONObject2 = new JSONObject();
                str3 = str;
                str4 = str2;
                try {
                    jSONObject2.put("limit", accountLimitAmountMAmount2.mLimit());
                } catch (JSONException unused20) {
                    yk.a.e();
                }
                try {
                    jSONObject2.put("remaining", accountLimitAmountMAmount2.mRemaining());
                } catch (JSONException unused21) {
                    yk.a.e();
                }
                try {
                    jSONObject2.put("currency", accountLimitAmountMAmount2.mCurrency());
                } catch (JSONException unused22) {
                    yk.a.e();
                }
            } else {
                str3 = str;
                str4 = str2;
                jSONObject2 = null;
            }
            try {
                jSONObject7.put("amount", jSONObject2);
            } catch (JSONException unused23) {
                yk.a.e();
            }
            arrayList2.add(jSONObject7);
            it2 = it3;
            str2 = str4;
            str = str3;
        }
        try {
            jSONObject5.put("monthly", new JSONArray((Collection) arrayList2));
        } catch (JSONException unused24) {
            yk.a.e();
        }
        return jSONObject5;
    }

    public static final JSONObject e(Amount amount) {
        JSONObject jSONObject = new JSONObject();
        String formattedValue = amount.getFormattedValue();
        kotlin.jvm.internal.j.f(formattedValue, "getFormattedValue(...)");
        try {
            jSONObject.put("value", zj.z.t(formattedValue, ",", ""));
        } catch (JSONException unused) {
            yk.a.e();
        }
        try {
            jSONObject.put("currency", amount.mCurrency());
        } catch (JSONException unused2) {
            yk.a.e();
        }
        return jSONObject;
    }

    public static final JSONObject f(String str, String str2, String str3, boolean z4) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(SessionDescription.ATTR_TYPE, str);
        } catch (JSONException unused) {
            yk.a.e();
        }
        try {
            jSONObject2.put("value", str2);
        } catch (JSONException unused2) {
            yk.a.e();
        }
        try {
            jSONObject2.put("verified", String.valueOf(z4));
        } catch (JSONException unused3) {
            yk.a.e();
        }
        try {
            jSONObject.put("identities", jSONArray.put(jSONObject2));
        } catch (JSONException unused4) {
            yk.a.e();
        }
        try {
            jSONObject.put("kyc", str3);
        } catch (JSONException unused5) {
            yk.a.e();
        }
        return jSONObject;
    }

    public static final String g(Amount amount, AccountLimits accountLimits) {
        kotlin.jvm.internal.j.g(accountLimits, "accountLimits");
        JSONObject jSONObjectE = e(amount);
        JSONObject jSONObjectD = d(accountLimits);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("balance", jSONObjectE);
        } catch (JSONException unused) {
            yk.a.e();
        }
        try {
            jSONObject.put("limits", jSONObjectD);
        } catch (JSONException unused2) {
            yk.a.e();
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        return string;
    }

    public static final byte[] h(String str, HashMap map) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SessionDescription.ATTR_TYPE, "msisdn");
        } catch (JSONException unused) {
            yk.a.e();
        }
        if (str != null) {
            try {
                jSONObject.put("value", str);
            } catch (JSONException unused2) {
                yk.a.e();
            }
        }
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((String) entry.getValue()) != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            try {
                jSONObject.put("otp_params", new JSONObject(linkedHashMap));
            } catch (JSONException unused3) {
                yk.a.e();
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(Constants.METHOD, "OTP");
        } catch (JSONException unused4) {
            yk.a.e();
        }
        try {
            jSONObject2.put("params", jSONObject);
        } catch (JSONException unused5) {
            yk.a.e();
        }
        String string = jSONObject2.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        byte[] bytes = string.getBytes(C2581c.f21468b);
        kotlin.jvm.internal.j.f(bytes, "getBytes(...)");
        return bytes;
    }

    public static final void i(io.ktor.utils.io.n nVar) {
        kotlin.jvm.internal.j.g(nVar, "<this>");
        nVar.a(new IOException("Channel was cancelled"));
    }

    public static final void j(InterfaceC2488d interfaceC2488d, Object obj) {
        kotlin.jvm.internal.j.g(interfaceC2488d, "<this>");
        C1790e c1790e = (C1790e) interfaceC2488d;
        if (c1790e.d(obj)) {
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
        } else {
            throw new ClassCastException("Value cannot be cast to " + c1790e.b());
        }
    }

    public static final byte[] k(CharsetEncoder charsetEncoder, CharSequence input, int i, int i4) throws CharacterCodingException {
        kotlin.jvm.internal.j.g(charsetEncoder, "<this>");
        kotlin.jvm.internal.j.g(input, "input");
        if (input instanceof String) {
            if (i == 0) {
                String str = (String) input;
                if (i4 == str.length()) {
                    byte[] bytes = str.getBytes(charsetEncoder.charset());
                    kotlin.jvm.internal.j.f(bytes, "getBytes(...)");
                    return bytes;
                }
            }
            String strSubstring = ((String) input).substring(i, i4);
            kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
            byte[] bytes2 = strSubstring.getBytes(charsetEncoder.charset());
            kotlin.jvm.internal.j.f(bytes2, "getBytes(...)");
            return bytes2;
        }
        ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(input, i, i4));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr2);
        return bArr2;
    }

    public static MessageDigest m() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static final String o(Charset charset) {
        kotlin.jvm.internal.j.g(charset, "<this>");
        String strName = charset.name();
        kotlin.jvm.internal.j.f(strName, "name(...)");
        return strName;
    }

    public static SharedPreferences r(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static void t(String str) {
        if (!Pattern.compile("^\\d{2}$").matcher(str).matches()) {
            throw new UnknownTagException(str);
        }
    }

    public static boolean u(int i, int i4, String str) throws UnknownTagException {
        try {
            int i6 = Integer.parseInt(str);
            return i6 > i - 1 && i6 < i4 + 1;
        } catch (Exception unused) {
            throw new UnknownTagException(String.format("%1$s is not a valid tag number.", str));
        }
    }

    public static final void v(String str, String tag) {
        kotlin.jvm.internal.j.g(str, "<this>");
        kotlin.jvm.internal.j.g(tag, "tag");
    }

    public static /* synthetic */ void w(int i, String str, String str2) {
        if ((i & 1) != 0) {
            str2 = "Raven";
        }
        v(str, str2);
    }

    public static C0496d x(String str) throws BadContentTypeFormatException {
        if (C2576A.H(str)) {
            return C0496d.f;
        }
        Ng.h hVar = (Ng.h) C1110A.G(S1.r.r(str));
        String str2 = hVar.f4426a;
        int iE = C2576A.E(str2, '/', 0, 6);
        if (iE == -1) {
            if (kotlin.jvm.internal.j.b(C2576A.b0(str2).toString(), ProxyConfig.MATCH_ALL_SCHEMES)) {
                return C0496d.f;
            }
            throw new BadContentTypeFormatException("Bad Content-Type format: ".concat(str));
        }
        String strSubstring = str2.substring(0, iE);
        kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
        String string = C2576A.b0(strSubstring).toString();
        if (string.length() == 0) {
            throw new BadContentTypeFormatException("Bad Content-Type format: ".concat(str));
        }
        String strSubstring2 = str2.substring(iE + 1);
        kotlin.jvm.internal.j.f(strSubstring2, "substring(...)");
        String string2 = C2576A.b0(strSubstring2).toString();
        if (C2576A.y(string, ' ') || C2576A.y(string2, ' ')) {
            throw new BadContentTypeFormatException("Bad Content-Type format: ".concat(str));
        }
        if (string2.length() == 0 || C2576A.y(string2, '/')) {
            throw new BadContentTypeFormatException("Bad Content-Type format: ".concat(str));
        }
        return new C0496d(string, string2, hVar.f4427b);
    }

    public static void y(NewMayaCreditFragment newMayaCreditFragment, String str, String str2, String str3, String str4, View.OnClickListener onClickListener) {
        Q9.G g8 = newMayaCreditFragment.D1;
        if (g8 != null) {
            M2.b.Z(2131231347, str, str2, str3, str4, true, null, onClickListener, false, 320).show(((MayaDashboardActivity) g8).getSupportFragmentManager(), "error_dialog");
        }
    }

    public static void z(int i, View view) {
        AlphaAnimation alphaAnimation = i == 0 ? new AlphaAnimation(0.0f, 1.0f) : new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(100L);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    @Override // bf.InterfaceC0950c
    public void a(Serializable serializable) {
        q().a(serializable);
    }

    @Override // bf.InterfaceC0950c
    public void b(String str, HashMap map) {
        q().b(str, map);
    }

    public abstract Object l(String str);

    public abstract String n();

    public boolean p() {
        return Boolean.TRUE.equals(l("noResult"));
    }

    public abstract InterfaceC0950c q();

    public abstract boolean s();

    public String toString() {
        switch (this.f3133a) {
            case 12:
                return n() + Global.BLANK + ((String) l("sql")) + Global.BLANK + ((List) l("arguments"));
            default:
                return super.toString();
        }
    }
}
