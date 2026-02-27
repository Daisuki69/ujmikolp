package Xh;

import G7.F;
import Ng.A;
import Ng.B;
import Ng.y;
import S1.s;
import a.AbstractC0617a;
import android.util.Base64;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.exoplayer.upstream.CmcdData;
import bg.C0965G0;
import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
import cj.C1110A;
import cj.C1112C;
import cj.M;
import cj.t;
import cj.x;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxa;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.common.utility.C;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import defpackage.AbstractC1414e;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.reactivex.exceptions.ProtocolViolationException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C1790e;
import p3.C2011b;
import v3.AbstractC2338a;
import v3.C2340c;
import zj.C2576A;
import zj.C2580b;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i {
    public static void A(Class cls) {
        String name = cls.getName();
        s.r(new ProtocolViolationException(We.s.l("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
    }

    public static long B(long j, long j6) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j6) + Long.numberOfLeadingZeros(j6) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j6;
        }
        long j7 = ((j ^ j6) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j6 == Long.MIN_VALUE) & (j < 0)))) {
            long j9 = j * j6;
            if (j == 0 || j9 / j == j6) {
                return j9;
            }
        }
        return j7;
    }

    public static final void C(A a8, String value) {
        kotlin.jvm.internal.j.g(a8, "<this>");
        kotlin.jvm.internal.j.g(value, "value");
        a8.d(C2576A.H(value) ? C1112C.f9377a : value.equals("/") ? B.f4407a : C1110A.W(C2576A.S(value, new char[]{'/'})));
    }

    public static final void D(Fragment fragment, C1790e c1790e, Function1 function1) {
        kotlin.jvm.internal.j.g(fragment, "<this>");
        FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
        String strC = c1790e.c();
        if (strC == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        parentFragmentManager.setFragmentResultListener(strC, fragment.getViewLifecycleOwner(), new G5.q(function1));
    }

    public static final void E(Fragment fragment, C1790e c1790e, Function1 function1) {
        kotlin.jvm.internal.j.g(fragment, "<this>");
        FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
        String strC = c1790e.c();
        if (strC == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        parentFragmentManager.setFragmentResultListener(strC, fragment.getViewLifecycleOwner(), new G5.p(function1));
    }

    public static final void F(MayaKycBaseFragment mayaKycBaseFragment, C1790e c1790e, Function1 function1, String str) {
        FragmentManager parentFragmentManager = mayaKycBaseFragment.getParentFragmentManager();
        String strC = c1790e.c();
        if (strC == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        parentFragmentManager.setFragmentResultListener(((Object) strC) + str, mayaKycBaseFragment.getViewLifecycleOwner(), new A7.r(str, function1));
    }

    public static final void G(Fragment fragment, Object obj) {
        kotlin.jvm.internal.j.g(fragment, "<this>");
        fragment.getParentFragmentManager().setFragmentResult(fragment.getClass().getSimpleName(), BundleKt.bundleOf(new Pair("fragment.result.key", obj)));
    }

    public static final void H(Fragment fragment, Object value, String str) {
        kotlin.jvm.internal.j.g(fragment, "<this>");
        kotlin.jvm.internal.j.g(value, "value");
        fragment.getParentFragmentManager().setFragmentResult(fragment.getClass().getSimpleName().concat(str), BundleKt.bundleOf(new Pair(str, value)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void J(androidx.fragment.app.FragmentActivity r5, kotlin.jvm.functions.Function0 r6) {
        /*
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.j.g(r5, r0)
            boolean r0 = k2.v0.q(r5)
            if (r0 == 0) goto L4f
            org.joda.time.format.DateTimeFormatter r0 = com.paymaya.common.utility.AbstractC1234x.f11248a
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "yyyy/MM/dd HH:mm"
            r0.<init>(r2, r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            com.paymaya.data.preference.a r1 = com.paymaya.data.preference.a.j(r5)
            android.content.SharedPreferences r1 = r1.f11330b
            java.lang.String r3 = "key_in_app_review_date"
            java.lang.String r4 = ""
            java.lang.String r1 = dOYHB6.yFtIp6.svM7M6.getString(r1, r3, r4)
            java.lang.String r3 = "getInAppReviewDate(...)"
            kotlin.jvm.internal.j.f(r1, r3)
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.util.Locale r4 = java.util.Locale.getDefault()
            r3.<init>(r2, r4)
            r2 = 1
            java.util.Date r0 = r3.parse(r0)     // Catch: java.text.ParseException -> L4b
            java.util.Date r1 = r3.parse(r1)     // Catch: java.text.ParseException -> L4b
            boolean r0 = r0.after(r1)     // Catch: java.text.ParseException -> L4b
            goto L4c
        L4b:
            r0 = r2
        L4c:
            if (r0 == 0) goto L4f
            goto L50
        L4f:
            r2 = 0
        L50:
            if (r2 == 0) goto L70
            I1.a r0 = com.google.android.play.core.review.ReviewManagerFactory.create(r5)
            java.lang.String r1 = "create(...)"
            kotlin.jvm.internal.j.f(r0, r1)
            r1 = r0
            com.google.android.play.core.review.b r1 = (com.google.android.play.core.review.b) r1
            com.google.android.gms.tasks.Task r1 = r1.b()
            java.lang.String r2 = "requestReviewFlow(...)"
            kotlin.jvm.internal.j.f(r1, r2)
            Bb.c r2 = new Bb.c
            r3 = 5
            r2.<init>(r3, r0, r5, r6)
            r1.addOnCompleteListener(r2)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Xh.i.J(androidx.fragment.app.FragmentActivity, kotlin.jvm.functions.Function0):void");
    }

    public static final ok.b a(String str) {
        return ok.d.b().a().a(str);
    }

    public static final void b(Wf.a log, Xf.b bVar) {
        kotlin.jvm.internal.j.h(log, "$this$log");
        if (bVar != null) {
            String str = log.f6428b;
            Pair pair = new Pair("error_message", str);
            int i = log.c;
            ((C0965G0) bVar).a(str, M.i(pair, new Pair(StateEvent.Name.ERROR_CODE, String.valueOf(i))), new Pair(StateEvent.Name.ERROR_CODE, String.valueOf(i)));
        }
    }

    public static final void c(A a8, StringBuilder sb2) {
        List listC;
        sb2.append(a8.c().f4409a);
        String str = a8.c().f4409a;
        int iHashCode = str.hashCode();
        if (iHashCode != -1081572750) {
            if (iHashCode != 3143036) {
                if (iHashCode == 92611469 && str.equals("about")) {
                    CharSequence charSequence = a8.f4403a;
                    sb2.append(Global.COLON);
                    sb2.append(charSequence);
                    return;
                }
            } else if (str.equals(Constants.FILE)) {
                CharSequence charSequence2 = a8.f4403a;
                String strV = v(a8);
                sb2.append("://");
                sb2.append(charSequence2);
                kotlin.jvm.internal.j.g(strV, "<this>");
                boolean z4 = false;
                if (strV.length() > 0 && C2580b.c(strV.charAt(0), '/', false)) {
                    z4 = true;
                }
                if (!z4) {
                    sb2.append('/');
                }
                sb2.append((CharSequence) strV);
                return;
            }
        } else if (str.equals("mailto")) {
            StringBuilder sb3 = new StringBuilder();
            String str2 = a8.e;
            String str3 = a8.f;
            if (str2 != null) {
                sb3.append(str2);
                if (str3 != null) {
                    sb3.append(':');
                    sb3.append(str3);
                }
                sb3.append("@");
            }
            CharSequence string = sb3.toString();
            kotlin.jvm.internal.j.f(string, "toString(...)");
            CharSequence charSequence3 = a8.f4403a;
            sb2.append(Global.COLON);
            sb2.append(string);
            sb2.append(charSequence3);
            return;
        }
        sb2.append("://");
        sb2.append(s(a8));
        String encodedPath = v(a8);
        y encodedQueryParameters = a8.i;
        boolean z5 = a8.f4404b;
        kotlin.jvm.internal.j.g(encodedPath, "encodedPath");
        kotlin.jvm.internal.j.g(encodedQueryParameters, "encodedQueryParameters");
        if (!C2576A.H(encodedPath) && !z.w(encodedPath, 2, "/", false)) {
            sb2.append('/');
        }
        sb2.append((CharSequence) encodedPath);
        if (!((Map) encodedQueryParameters.f5552b).isEmpty() || z5) {
            sb2.append(Global.QUESTION);
        }
        Set<Map.Entry> setA = encodedQueryParameters.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setA) {
            String str4 = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listC = cj.r.c(new Pair(str4, null));
            } else {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(t.l(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new Pair(str4, (String) it.next()));
                }
                listC = arrayList2;
            }
            x.p(listC, arrayList);
        }
        C1110A.E(arrayList, sb2, "&", new F(20), 60);
        if (a8.f4406g.length() > 0) {
            sb2.append('#');
            sb2.append(a8.f4406g);
        }
    }

    public static byte[] d(String str) {
        try {
            return Base64.decode(str, 0);
        } catch (IllegalArgumentException e) {
            Ri.a.g("Received bytes didn't correspond to a valid Base64 encoded string." + e.getLocalizedMessage());
            return null;
        } catch (Exception e7) {
            AbstractC1414e.o(e7, new StringBuilder("An unknown error has occurred "));
            return null;
        }
    }

    public static void e(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void f(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static void g(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static long h(long j, long j6) {
        long j7 = j + j6;
        if (((j ^ j6) < 0) || ((j ^ j7) >= 0)) {
            return j7;
        }
        throw new ArithmeticException(We.s.h(j6, ")", androidx.camera.core.impl.a.s(j, "overflow: checkedAdd(", ", ")));
    }

    public static final long i(InputStream inputStream, OutputStream outputStream) throws IOException {
        kotlin.jvm.internal.j.g(inputStream, "<this>");
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        long j = 0;
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            j += (long) i;
            i = inputStream.read(bArr);
        }
        return j;
    }

    public static String j(String str, String str2) {
        if (C.e(str)) {
            return "";
        }
        try {
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, Base64.decode(str2, 0));
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, w(), gCMParameterSpec);
            return new String(cipher.doFinal(u(str)), "UTF-8");
        } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            e.getMessage();
            yk.a.c();
            throw new PayMayaRuntimeException("KeyStore decrypt: " + e.getMessage(), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r8 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r8 < 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long k(long r8, long r10, java.math.RoundingMode r12) {
        /*
            r12.getClass()
            long r0 = r8 / r10
            long r2 = r10 * r0
            long r2 = r8 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            goto L53
        L10:
            long r8 = r8 ^ r10
            r7 = 63
            long r8 = r8 >> r7
            int r8 = (int) r8
            r8 = r8 | 1
            int[] r9 = Q1.e.f5202a
            int r7 = r12.ordinal()
            r9 = r9[r7]
            switch(r9) {
                case 1: goto L51;
                case 2: goto L53;
                case 3: goto L4c;
                case 4: goto L4e;
                case 5: goto L49;
                case 6: goto L28;
                case 7: goto L28;
                case 8: goto L28;
                default: goto L22;
            }
        L22:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L28:
            long r2 = java.lang.Math.abs(r2)
            long r9 = java.lang.Math.abs(r10)
            long r9 = r9 - r2
            long r2 = r2 - r9
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 != 0) goto L46
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_UP
            if (r12 == r9) goto L4e
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_EVEN
            if (r12 != r9) goto L53
            r9 = 1
            long r9 = r9 & r0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto L53
            goto L4e
        L46:
            if (r9 <= 0) goto L53
            goto L4e
        L49:
            if (r8 <= 0) goto L53
            goto L4e
        L4c:
            if (r8 >= 0) goto L53
        L4e:
            long r8 = (long) r8
            long r0 = r0 + r8
            return r0
        L51:
            if (r6 != 0) goto L54
        L53:
            return r0
        L54:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            java.lang.String r9 = "mode was UNNECESSARY, but rounding was necessary"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Xh.i.k(long, long, java.math.RoundingMode):long");
    }

    public static String l(String str) {
        try {
            byte[] bArrEncode = Base64.encode(str.getBytes(C2011b.b()), 0);
            return new String(bArrEncode, 0, bArrEncode.length, C2011b.b());
        } catch (IllegalArgumentException e) {
            Ri.a.g("Received bytes didn't correspond to a valid Base64 encoded string." + e.getLocalizedMessage());
            return null;
        } catch (Exception e7) {
            AbstractC1414e.o(e7, new StringBuilder("An unknown error has occurred "));
            return null;
        }
    }

    public static Map m(String str) {
        String strQ;
        Cipher cipher;
        if (C.e(str)) {
            return Collections.EMPTY_MAP;
        }
        try {
            strQ = q();
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, Base64.decode(strQ, 0));
            cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, w(), gCMParameterSpec);
        } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            e = e;
        }
        try {
            String strEncodeToString = Base64.encodeToString(cipher.doFinal(str.getBytes("UTF-8")), 0);
            HashMap map = new HashMap();
            map.put("iv", strQ);
            map.put("data", strEncodeToString);
            return map;
        } catch (UnsupportedEncodingException e7) {
            e = e7;
            e.getMessage();
            yk.a.c();
            throw new PayMayaRuntimeException("KeyStore Encrypting: " + e.getMessage(), e);
        } catch (InvalidAlgorithmParameterException e10) {
            e = e10;
            e.getMessage();
            yk.a.c();
            throw new PayMayaRuntimeException("KeyStore Encrypting: " + e.getMessage(), e);
        } catch (InvalidKeyException e11) {
            e = e11;
            e.getMessage();
            yk.a.c();
            throw new PayMayaRuntimeException("KeyStore Encrypting: " + e.getMessage(), e);
        } catch (BadPaddingException e12) {
            e = e12;
            e.getMessage();
            yk.a.c();
            throw new PayMayaRuntimeException("KeyStore Encrypting: " + e.getMessage(), e);
        } catch (IllegalBlockSizeException e13) {
            e = e13;
            e.getMessage();
            yk.a.c();
            throw new PayMayaRuntimeException("KeyStore Encrypting: " + e.getMessage(), e);
        } catch (NoSuchPaddingException e14) {
            e = e14;
            e.getMessage();
            yk.a.c();
            throw new PayMayaRuntimeException("KeyStore Encrypting: " + e.getMessage(), e);
        }
    }

    public static J4.a n(byte[] bArr, String str, byte[] bArr2) {
        Object objA;
        Cipher cipher;
        GCMParameterSpec gCMParameterSpec;
        Object objA2;
        KeyPair keyPair;
        try {
            C1037h.a aVar = C1037h.f9166b;
            cipher = Cipher.getInstance("AES/GCM/NoPadding");
            gCMParameterSpec = new GCMParameterSpec(128, bArr2);
            try {
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
                keyPairGenerator.initialize(new ECGenParameterSpec("prime256v1"));
                objA2 = keyPairGenerator.generateKeyPair();
            } catch (Throwable th2) {
                C1037h.a aVar2 = C1037h.f9166b;
                objA2 = AbstractC1039j.a(th2);
            }
            if (objA2 instanceof C1038i) {
                objA2 = null;
            }
            keyPair = (KeyPair) objA2;
        } catch (Throwable th3) {
            C1037h.a aVar3 = C1037h.f9166b;
            objA = AbstractC1039j.a(th3);
        }
        if (keyPair == null) {
            throw new IllegalStateException("Failed to generate ephemeral key pair");
        }
        Key keyR = r(keyPair, str);
        if (keyR == null) {
            throw new IllegalStateException("Failed to generate shared secret");
        }
        cipher.init(1, keyR, gCMParameterSpec);
        byte[] encryptedData = cipher.doFinal(bArr);
        kotlin.jvm.internal.j.f(encryptedData, "encryptedData");
        byte[] encoded = keyPair.getPublic().getEncoded();
        kotlin.jvm.internal.j.f(encoded, "ephemeralKeyPair.public.encoded");
        String strEncodeToString = Base64.encodeToString(encoded, 2);
        kotlin.jvm.internal.j.f(strEncodeToString, "encodeToString(this, android.util.Base64.NO_WRAP)");
        objA = new J4.a(encryptedData, strEncodeToString, bArr2);
        return (J4.a) (objA instanceof C1038i ? null : objA);
    }

    public static void o(Rg.s sVar, Function2 function2) {
        for (Map.Entry entry : sVar.a()) {
            function2.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public static long p(long j, long j6) {
        AbstractC0617a.o(j, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY);
        AbstractC0617a.o(j6, "b");
        if (j == 0) {
            return j6;
        }
        if (j6 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j6);
        long j7 = j6 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j7) {
            long j9 = jNumberOfTrailingZeros - j7;
            long j10 = (j9 >> 63) & j9;
            long j11 = (j9 - j10) - j10;
            j7 += j10;
            jNumberOfTrailingZeros = j11 >> Long.numberOfTrailingZeros(j11);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static String q() {
        return Base64.encodeToString(new SecureRandom().generateSeed(12), 0);
    }

    public static Key r(KeyPair keyPair, String str) {
        Object objA;
        try {
            C1037h.a aVar = C1037h.f9166b;
            byte[] bArrDecode = Base64.decode(str, 2);
            kotlin.jvm.internal.j.f(bArrDecode, "decode(this, android.util.Base64.NO_WRAP)");
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(bArrDecode));
            KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
            keyAgreement.init(keyPair.getPrivate());
            keyAgreement.doPhase(publicKeyGeneratePublic, true);
            objA = keyAgreement.generateSecret("AES");
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        if (objA instanceof C1038i) {
            objA = null;
        }
        return (Key) objA;
    }

    public static final String s(A a8) {
        kotlin.jvm.internal.j.g(a8, "<this>");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        String str = a8.e;
        String str2 = a8.f;
        if (str != null) {
            sb3.append(str);
            if (str2 != null) {
                sb3.append(':');
                sb3.append(str2);
            }
            sb3.append("@");
        }
        String string = sb3.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        sb2.append(string);
        sb2.append(a8.f4403a);
        int i = a8.c;
        if (i != 0 && i != a8.c().f4410b) {
            sb2.append(Global.COLON);
            sb2.append(String.valueOf(a8.c));
        }
        String string2 = sb2.toString();
        kotlin.jvm.internal.j.f(string2, "toString(...)");
        return string2;
    }

    public static v3.d t(r3.b bVar) {
        Preconditions.checkNotNull(bVar, "You must provide a valid BarcodeScannerOptions.");
        C2340c c2340c = (C2340c) p3.g.c().a(C2340c.class);
        c2340c.getClass();
        v3.g gVar = (v3.g) c2340c.f20458a.get(bVar);
        bVar.getClass();
        return new v3.d(bVar, gVar, (Executor) c2340c.f20459b.f19025a.get(), zzxa.zzb(true != AbstractC2338a.c() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning"));
    }

    public static byte[] u(String str) {
        try {
            return Base64.decode(str.getBytes("UTF-8"), 0);
        } catch (UnsupportedEncodingException e) {
            yk.a.b();
            throw new PayMayaRuntimeException("Decoding string to byte: " + e.getMessage());
        }
    }

    public static final String v(A a8) {
        kotlin.jvm.internal.j.g(a8, "<this>");
        List list = a8.h;
        return list.isEmpty() ? "" : list.size() == 1 ? ((CharSequence) C1110A.A(list)).length() == 0 ? "/" : (String) C1110A.A(list) : C1110A.F(list, "/", null, null, null, 62);
    }

    public static SecretKey w() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return (SecretKey) keyStore.getKey("paymaya_security_key2", null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException e) {
            e.getMessage();
            yk.a.c();
            throw new PayMayaRuntimeException("KeyStore secretKey: " + e.getMessage(), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[LOOP:0: B:3:0x0003->B:28:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static d7.C1335b x(android.view.View r4) {
        /*
            r0 = 0
            r1 = r4
            r2 = r0
        L3:
            boolean r3 = r1 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r3 == 0) goto La
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L2f
        La:
            boolean r3 = r1 instanceof android.widget.FrameLayout
            if (r3 == 0) goto L20
            r2 = r1
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            int r2 = r2.getId()
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            if (r2 != r3) goto L1d
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L2f
        L1d:
            r2 = r1
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L20:
            android.view.ViewParent r1 = r1.getParent()
            boolean r3 = r1 instanceof android.view.View
            if (r3 == 0) goto L2b
            android.view.View r1 = (android.view.View) r1
            goto L2c
        L2b:
            r1 = r0
        L2c:
            if (r1 != 0) goto L3
            r1 = r2
        L2f:
            if (r1 != 0) goto L35
            yk.a.c()
            return r0
        L35:
            android.content.Context r4 = r4.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0 = 2131558898(0x7f0d01f2, float:1.8743125E38)
            r2 = 0
            android.view.View r4 = r4.inflate(r0, r1, r2)
            java.lang.String r0 = "null cannot be cast to non-null type com.paymaya.mayaui.common.view.widget.snackbar.MayaSwipeableSnackbarView"
            kotlin.jvm.internal.j.e(r4, r0)
            com.paymaya.mayaui.common.view.widget.snackbar.MayaSwipeableSnackbarView r4 = (com.paymaya.mayaui.common.view.widget.snackbar.MayaSwipeableSnackbarView) r4
            d7.a r0 = new d7.a
            r0.<init>(r4, r2)
            r1.setOnApplyWindowInsetsListener(r0)
            d7.b r0 = new d7.b
            r0.<init>(r1, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Xh.i.x(android.view.View):d7.b");
    }

    public static String y(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb2.append(str.charAt(i));
            if (str2.length() > i) {
                sb2.append(str2.charAt(i));
            }
        }
        return sb2.toString();
    }

    public static final byte[] z(InputStream inputStream) throws IOException {
        kotlin.jvm.internal.j.g(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        i(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.j.f(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
