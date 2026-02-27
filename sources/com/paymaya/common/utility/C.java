package com.paymaya.common.utility;

import We.InterfaceC0604h;
import a.AbstractC0617a;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.navigation.ActivityKt;
import androidx.navigation.NavAction;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavDirections;
import androidx.navigation.NavGraph;
import cj.C1110A;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.i18n.phonenumbers.NumberParseException;
import com.mastercard.mpqr.pushpayment.exception.InvalidTagValueException;
import com.mastercard.mpqr.pushpayment.exception.UnknownTagException;
import com.paymaya.PayMayaApplication;
import com.paymaya.R;
import com.paymaya.common.exception.MayaQRErrorException;
import com.paymaya.domain.model.BackUpIdentity;
import com.paymaya.domain.model.PlayMayaWebViewParameters;
import com.paymaya.domain.model.TransferAppLink;
import d2.C1328c;
import defpackage.AbstractC1414e;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k3.C1757b;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import s.AbstractC2217b;
import v5.C2342a;
import y4.AbstractC2505a;
import zj.C2576A;
import zj.C2581c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f10391a = "xhdpi";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T f10392b = new T("00", "", "Payload Format Indicator");
    public static final T c = new T("01", "", "Point of Initiation Method");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final T f10393d = new T("27", "", "Merchant Account Information");
    public static final T e = new T("28", "", "Merchant Account Information");
    public static final T f = new T("62", "00", "P2P Additional Data Globally Unique Id");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final T f10394g = new T("62", "00", "P2M Additional Data Globally Unique Id");
    public static final T h = new T("28", "00", "P2M Globally Unique Id");
    public static final T i = new T("27", "00", "P2P Payment System Unique ID");
    public static final T j = new T("27", "03", "P2P Merchant ID");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final T f10395k = new T("28", "03", "P2M Merchant ID");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final T f10396l = new T("27", "01", "P2P Acquirer ID");
    public static final T m = new T("28", "01", "P2M Acquirer ID");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final T f10397n = new T("27", "02", "Payment Type");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final T f10398o = new T("27", "04", "P2P Merchant Credit Account");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final T f10399p = new T("28", "04", "P2M Merchant Credit Account");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final T f10400q = new T("27", "05", "Merchant Mobile Number");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final T f10401r = new T("28", "05", "P2M Proxy Notif Flag");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final T f10402s = new T("52", "", "Merchant Category Code");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final T f10403t = new T("53", "", "Transaction Currency Code");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final T f10404u = new T("54", "", "Transaction Amount");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final T f10405v = new T("55", "", "Convenience Indicator");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final T f10406w = new T("56", "", "Value of Convenience Fee Fixed");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final T f10407x = new T("57", "", "Value of Convenience Fee Percentage");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final T f10408y = new T("58", "", "Country Code");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final T f10409z = new T("59", "", "Merchant Name");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final T f10374A = new T("60", "", "Merchant City");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final T f10375B = new T("61", "", "Postal Code");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final T f10376C = new T("62", "02", "Mobile Number");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final T f10377D = new T("62", "03", "Store Label");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final T f10378E = new T("62", "04", "Loyalty Number");

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final T f10379F = new T("62", "05", "Reference Label");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final T f10380G = new T("62", "06", "Customer Label");

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final T f10381H = new T("62", "07", "Terminal Label");

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final T f10382I = new T("62", "08", "Purpose of Transaction");
    public static final T J = new T("62", "09", "Additional Consumer Data Request");

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final T f10383K = new T("63", "", "Cyclic Redundancy Check");

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final T f10384L = new T("64.00", "", "Language Preference");

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final T f10385M = new T("64", "01", "Merchant Name – Alternate Language");

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final T f10386N = new T("64", "02", "Merchant City – Alternate Language");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final T f10387O = new T("88", "01", "Acquirer-Required Information");

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final T f10388P = new T("unknown", "", "Merchant Account Information");

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final T f10389Q = new T("unknown", "", "QRPH Type P2B");

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final T f10390R = new T("unknown", "", "unknown");

    public static HashMap A(String str) {
        HashMap map = new HashMap();
        if (str != null && !str.isEmpty()) {
            try {
                String query = new URI(str).getQuery();
                if (query != null) {
                    for (String str2 : query.split("&")) {
                        int iIndexOf = str2.indexOf("=");
                        String strSubstring = str2.substring(0, iIndexOf);
                        Charset charset = StandardCharsets.UTF_8;
                        map.put(URLDecoder.decode(strSubstring, charset.name()), URLDecoder.decode(str2.substring(iIndexOf + 1), charset.name()));
                    }
                }
            } catch (Exception e7) {
                e7.getMessage();
                yk.a.d();
            }
        }
        return map;
    }

    public static void A0(String str, T t5, boolean z4, int i4, String str2) throws MayaQRErrorException {
        if (str == null || str.isEmpty()) {
            if (z4) {
                String str3 = t5.c;
                yk.a.a();
                a0[] a0VarArr = a0.f10692a;
                throw new MayaQRErrorException(t5, "missingRequiredField", str, str2);
            }
            return;
        }
        if (str.length() == i4) {
            return;
        }
        String str4 = t5.c;
        yk.a.a();
        a0[] a0VarArr2 = a0.f10692a;
        throw new MayaQRErrorException(t5, "invalidLength", str, str2);
    }

    public static HashMap B(String str, boolean z4) {
        HashMap map = new HashMap();
        if (str != null && str.length() != 0) {
            String[] strArrSplit = str.split("\\?");
            if (strArrSplit.length > 1) {
                for (String str2 : strArrSplit[1].split("&")) {
                    String[] strArrSplit2 = str2.split("=");
                    if (strArrSplit2.length >= 2) {
                        String strDecode = strArrSplit2[0];
                        String strDecode2 = strArrSplit2[1];
                        if (z4) {
                            strDecode = Uri.decode(strDecode);
                        }
                        if (z4) {
                            strDecode2 = Uri.decode(strDecode2);
                        }
                        map.put(strDecode, strDecode2);
                    }
                }
            }
        }
        return map;
    }

    public static void B0(T t5, String str, String str2, String str3) throws MayaQRErrorException {
        if (str == null || !str.matches(str2)) {
            String str4 = t5.c;
            yk.a.a();
            a0[] a0VarArr = a0.f10692a;
            throw new MayaQRErrorException(t5, "invalidValue", str, str3);
        }
    }

    public static int C(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.colorPrimary});
        int color = typedArrayObtainStyledAttributes.getColor(0, ContextCompat.getColor(context, R.color.pma_theme_home_primary));
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    public static void C0(String str, String str2, boolean z4) throws InvalidTagValueException {
        if ((str != null || z4) && str != null && str.length() != 0 && !str.equals("***") && !AbstractC1213b.U("^[A-Za-z0-9_~`!@#$%^&*()\\-\\+={}\\[\\]\\\\|:;\"'<>,.?/Ññ ]+$", str)) {
            throw new InvalidTagValueException(str2, str, "Invalid pattern value for tag.");
        }
    }

    public static String D(String str, HashMap map, String... strArr) {
        for (String str2 : strArr) {
            map.remove(str2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Uri.parse(str).buildUpon().clearQuery().toString());
        if (!map.isEmpty()) {
            boolean z4 = true;
            for (Map.Entry entry : map.entrySet()) {
                if (z4) {
                    sb2.append(Global.QUESTION);
                    z4 = false;
                } else {
                    sb2.append("&");
                }
                sb2.append((String) entry.getKey());
                sb2.append("=");
                sb2.append((String) entry.getValue());
            }
        }
        return sb2.toString();
    }

    public static void D0(Bitmap bitmap, File file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException unused) {
            yk.a.e();
        }
    }

    public static CharSequence E(FragmentActivity fragmentActivity, NavDirections navDirections, int i4) {
        CharSequence label;
        CharSequence label2;
        String string;
        NavAction action;
        kotlin.jvm.internal.j.g(navDirections, "navDirections");
        NavController navControllerFindNavController = ActivityKt.findNavController(fragmentActivity, i4);
        NavDestination currentDestination = navControllerFindNavController.getCurrentDestination();
        Integer numValueOf = (currentDestination == null || (action = currentDestination.getAction(navDirections.getActionId())) == null) ? null : Integer.valueOf(action.getDestinationId());
        if (numValueOf == null) {
            return "";
        }
        NavDestination navDestinationFindNode = navControllerFindNavController.getGraph().findNode(numValueOf.intValue());
        if (navDestinationFindNode instanceof NavGraph) {
            NavGraph navGraph = (NavGraph) navDestinationFindNode;
            NavDestination navDestinationFindNode2 = navGraph.findNode(navGraph.getStartDestinationId());
            return (navDestinationFindNode2 == null || (label2 = navDestinationFindNode2.getLabel()) == null || (string = label2.toString()) == null) ? "" : string;
        }
        if (navDestinationFindNode == null || (label = navDestinationFindNode.getLabel()) == null || label.length() == 0) {
            return "";
        }
        CharSequence label3 = navDestinationFindNode.getLabel();
        kotlin.jvm.internal.j.d(label3);
        return label3;
    }

    public static InvalidTagValueException E0(String qrFieldId, String str) {
        kotlin.jvm.internal.j.g(qrFieldId, "qrFieldId");
        return new InvalidTagValueException(qrFieldId, str, "Invalid length=" + Integer.valueOf(str.length()) + " for tag=" + qrFieldId);
    }

    public static Double F(String str) {
        return e(str) ? Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE) : Double.valueOf(Double.parseDouble(str.trim().replaceAll("[^\\d.]", "")));
    }

    public static InvalidTagValueException F0(String qrFieldValue, String str) {
        kotlin.jvm.internal.j.g(qrFieldValue, "qrFieldValue");
        return new InvalidTagValueException("27.05", qrFieldValue, We.s.l("Pattern=", str, " does not match value=", qrFieldValue, " for tag=27.05"));
    }

    public static InputFilter[] G() {
        return new InputFilter[]{new Gb.g(1)};
    }

    public static String H(String str) {
        String lowerCase;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        return kotlin.jvm.internal.j.b(lowerCase, "female") ? "FEMALE" : kotlin.jvm.internal.j.b(lowerCase, "male") ? "MALE" : "";
    }

    public static InputStream I(Context context, Uri uri) {
        if ("content".equals(uri.getScheme())) {
            return context.getContentResolver().openInputStream(uri);
        }
        if (Constants.FILE.equals(uri.getScheme())) {
            return new FileInputStream(uri.getPath());
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String J(String str) {
        String lowerCase;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (lowerCase == null) {
            return "";
        }
        switch (lowerCase.hashCode()) {
            case -902265784:
                return !lowerCase.equals("single") ? "" : "SINGLE";
            case 312983136:
                return !lowerCase.equals("divorced/separated") ? "" : "DIVORCED_OR_SEPARATED";
            case 839462772:
                return !lowerCase.equals("married") ? "" : "MARRIED";
            case 1340592985:
                return !lowerCase.equals("widowed") ? "" : "WIDOWED";
            default:
                return "";
        }
    }

    public static String K(String str) {
        try {
            return "63" + C1757b.b().i(str, "").f18104b;
        } catch (NumberParseException unused) {
            yk.a.e();
            return str;
        }
    }

    public static String L(String str, String str2) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String[] strArrSplit = str.split("\\?");
        if (strArrSplit.length <= 1) {
            return null;
        }
        for (String str3 : strArrSplit[1].split("&")) {
            if (str3 != null && str3.startsWith(str2.concat("="))) {
                return str3.replaceFirst(str2.concat("="), "").trim();
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String M(String str) {
        String lowerCase;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (lowerCase == null) {
            return "";
        }
        switch (lowerCase.hashCode()) {
            case -1266283874:
                return !lowerCase.equals("friend") ? "" : "FRIEND";
            case -1185871622:
                return !lowerCase.equals("in-law") ? "" : "IN_LAW";
            case -995424086:
                return !lowerCase.equals("parent") ? "" : "PARENT";
            case -895757675:
                return !lowerCase.equals("spouse") ? "" : "SPOUSE";
            case -268316490:
                return !lowerCase.equals("grandparent") ? "" : "GRANDPARENT";
            case 94631196:
                return lowerCase.equals("child") ? "CHILD" : "";
            case 395180944:
                return !lowerCase.equals("grandchild") ? "" : "GRANDCHILD";
            case 1883419567:
                return !lowerCase.equals("colleague") ? "" : "COLLEAGUE";
            case 2083595970:
                return !lowerCase.equals("sibling") ? "" : "SIBLING";
            default:
                return "";
        }
    }

    public static Uri N(String filename, ContentResolver contentResolver) throws IOException {
        kotlin.jvm.internal.j.g(filename, "filename");
        String strL = We.s.l("relative_path='Download/' AND _display_name LIKE '", (String) C1110A.A(C2576A.T(filename, new String[]{"."}, 6)), "%.", (String) C1110A.G(C2576A.T(filename, new String[]{"."}, 6)), "' ");
        Cursor cursorQuery = contentResolver.query(MediaStore.Downloads.EXTERNAL_CONTENT_URI, new String[]{"_id"}, strL, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.getCount() >= 1) {
                    cursorQuery.moveToLast();
                    Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Downloads.EXTERNAL_CONTENT_URI, cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id")));
                    cursorQuery.close();
                    return uriWithAppendedId;
                }
            } finally {
            }
        }
        AbstractC0617a.p(cursorQuery, null);
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String O(com.paymaya.domain.model.ImageUrl r5) {
        /*
            java.lang.String r0 = com.paymaya.common.utility.C.f10391a
            int r1 = r0.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r1) {
                case -1619189395: goto L35;
                case -745448715: goto L2b;
                case 3197941: goto L21;
                case 3346896: goto L17;
                case 114020461: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L3f
        Ld:
            java.lang.String r1 = "xhdpi"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3f
            r0 = 4
            goto L40
        L17:
            java.lang.String r1 = "mdpi"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3f
            r0 = 0
            goto L40
        L21:
            java.lang.String r1 = "hdpi"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3f
            r0 = r4
            goto L40
        L2b:
            java.lang.String r1 = "xxhdpi"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3f
            r0 = r3
            goto L40
        L35:
            java.lang.String r1 = "xxxhdpi"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3f
            r0 = r2
            goto L40
        L3f:
            r0 = -1
        L40:
            r1 = 0
            if (r0 == 0) goto La2
            if (r0 == r4) goto L97
            if (r0 == r3) goto L76
            if (r0 == r2) goto L55
            boolean r0 = e(r5)
            if (r0 != 0) goto L54
            java.lang.String r5 = r5.mXhdpi()
            return r5
        L54:
            return r1
        L55:
            boolean r0 = e(r5)
            if (r0 != 0) goto L6a
            java.lang.String r0 = r5.mXxxhdpi()
            boolean r0 = e(r0)
            if (r0 != 0) goto L6a
            java.lang.String r5 = r5.mXxxhdpi()
            return r5
        L6a:
            boolean r0 = e(r5)
            if (r0 != 0) goto L75
            java.lang.String r5 = r5.mXhdpi()
            return r5
        L75:
            return r1
        L76:
            boolean r0 = e(r5)
            if (r0 != 0) goto L8b
            java.lang.String r0 = r5.mXxhdpi()
            boolean r0 = e(r0)
            if (r0 != 0) goto L8b
            java.lang.String r5 = r5.mXxhdpi()
            return r5
        L8b:
            boolean r0 = e(r5)
            if (r0 != 0) goto L96
            java.lang.String r5 = r5.mXhdpi()
            return r5
        L96:
            return r1
        L97:
            boolean r0 = e(r5)
            if (r0 != 0) goto Lad
            java.lang.String r5 = r5.mHdpi()
            return r5
        La2:
            boolean r0 = e(r5)
            if (r0 != 0) goto Lad
            java.lang.String r5 = r5.mMdpi()
            return r5
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.common.utility.C.O(com.paymaya.domain.model.ImageUrl):java.lang.String");
    }

    public static String P(String str, AbstractC2505a abstractC2505a) throws InvalidTagValueException {
        try {
            return abstractC2505a.b(str);
        } catch (UnknownTagException unused) {
            yk.a.b();
            throw new InvalidTagValueException(str, (String) null, "Unknown tag=".concat(str));
        }
    }

    public static void Q(Activity activity, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager == null || view == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void R(FragmentActivity fragmentActivity) {
        Q(fragmentActivity, fragmentActivity.getCurrentFocus());
    }

    public static void S(FragmentActivity fragmentActivity, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Q(fragmentActivity, (View) it.next());
        }
    }

    public static synchronized void T(PayMayaApplication payMayaApplication) {
        try {
            float f3 = payMayaApplication.getResources().getDisplayMetrics().density;
            if (f3 <= 1.0f) {
                f10391a = "mdpi";
            } else if (f3 <= 1.5f) {
                f10391a = "hdpi";
            } else if (f3 <= 2.0f) {
                f10391a = "xhdpi";
            } else if (f3 < 3.0f) {
                f10391a = "xxhdpi";
            } else {
                f10391a = "xxxhdpi";
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static Uri U(String str, String str2, long j6, ContentResolver contentResolver) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", str2);
        contentValues.put("_size", Long.valueOf(j6));
        return contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
    }

    public static boolean V(String str) {
        return str.startsWith("https://paymaya.com/app/") || str.startsWith("https://www.paymaya.com/app/") || str.startsWith("https://assets.paymaya.com/app/") || str.startsWith("https://maya.ph/app/") || str.startsWith("https://www.maya.ph/app/") || str.startsWith("https://assets.maya.ph/app/");
    }

    public static boolean W(Context context) {
        NetworkInfo activeNetworkInfo;
        return (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    public static boolean X(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            return false;
        }
        return (str.startsWith("“") && str.endsWith("”")) ? false : true;
    }

    public static boolean Y(String str) {
        if (str != null) {
            return str.startsWith("paymaya://") || V(str);
        }
        return false;
    }

    public static final boolean Z(Context context) {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
    }

    public static String a(int i4, String str) {
        StringBuilder sbV = We.s.v(str, Global.UNDERSCORE);
        sbV.append(AbstractC1173g.c(i4));
        return sbV.toString();
    }

    public static boolean a0(String str) {
        return str.matches("[0-9]+") && str.length() == 16;
    }

    public static String b(String str, EnumC1217f enumC1217f, int i4) {
        StringBuilder sbV = We.s.v(str, Global.UNDERSCORE);
        sbV.append(enumC1217f.f11196a);
        sbV.append(Global.UNDERSCORE);
        sbV.append(AbstractC1173g.c(i4));
        return sbV.toString();
    }

    public static void b0(String str, ImageView imageView, int i4, int i6, InterfaceC0604h interfaceC0604h) {
        if (str != null && str.trim().length() == 0) {
            str = null;
        }
        We.G gH = We.A.d().h(str);
        We.E e7 = gH.f6359b;
        e7.f(i4, i6);
        gH.i(new C1231u());
        e7.f6351b = true;
        e7.e = 17;
        gH.e(imageView, interfaceC0604h);
    }

    public static String c(String str, String str2, String str3, BackUpIdentity backUpIdentity) {
        com.google.gson.q qVar = new com.google.gson.q();
        qVar.l("m", str2);
        qVar.l(TtmlNode.TAG_P, str3);
        qVar.l("os", We.s.k("ANDROID ", Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT].getName(), Global.BLANK, Build.VERSION.RELEASE));
        if (backUpIdentity != null && backUpIdentity.isVerifiedEmail()) {
            qVar.l("e", backUpIdentity.mValue());
        }
        return androidx.camera.core.impl.a.j(str, "?q=", Uri.encode(Base64Utils.encodeUrlSafe(qVar.toString().getBytes())));
    }

    public static void c0(String str, int i4, ImageView imageView, int i6, int i10, int i11) {
        if (str != null && str.trim().length() == 0) {
            str = null;
        }
        We.G gH = We.A.d().h(str);
        gH.h(i4);
        C1230t c1230t = new C1230t();
        c1230t.f11231b = i6;
        c1230t.f11230a = i10;
        c1230t.c = i11;
        gH.i(c1230t);
        gH.e(imageView, null);
    }

    public static String d(String str, String str2, String str3) {
        return (str == null || str.length() == 0 || !Y(str)) ? str : Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build().toString();
    }

    public static void d0(ImageView imageView, String str) {
        We.A.d().e(str);
        We.A.d().h(str).e(imageView, null);
    }

    public static boolean e(Object obj) {
        return obj instanceof String ? ((String) obj).isEmpty() : obj instanceof List ? ((List) obj).isEmpty() : obj instanceof C2342a ? ((C2342a) obj).f20476a == null : obj == null;
    }

    public static void e0(String str, ImageView imageView, int i4) {
        if (str != null && str.trim().length() == 0) {
            str = null;
        }
        We.G gH = We.A.d().h(str);
        gH.h(i4);
        gH.e(imageView, null);
    }

    public static String f(List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            sb2.append("__,__");
        }
        sb2.setLength(sb2.length() - 5);
        return sb2.toString();
    }

    public static void f0(String str, ImageView imageView, InterfaceC0604h interfaceC0604h) {
        We.A.d().e(str);
        We.A.d().h(str).e(imageView, interfaceC0604h);
    }

    public static String g(String str) {
        return str.replace("https://paymaya.com/app/", "paymaya://").replace("https://www.paymaya.com/app/", "paymaya://").replace("https://assets.paymaya.com/app/", "paymaya://").replace("https://maya.ph/app/", "paymaya://").replace("https://www.maya.ph/app/", "paymaya://").replace("https://assets.maya.ph/app/", "paymaya://");
    }

    public static void g0(ImageView imageView, String str) {
        We.A.d().h(str).e(imageView, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File h(android.content.Context r8, android.net.Uri r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.common.utility.C.h(android.content.Context, android.net.Uri, java.lang.String):java.io.File");
    }

    public static void h0(String str, ImageView imageView, InterfaceC0604h interfaceC0604h) {
        We.A.d().h(str).e(imageView, interfaceC0604h);
    }

    public static void i(String str, String str2) {
        C1328c c1328cA = C1328c.a();
        String strJ = androidx.camera.core.impl.a.j(str, " - ", str2);
        h2.q qVar = c1328cA.f16255a;
        qVar.f16905p.f17092a.a(new h2.n(qVar, System.currentTimeMillis() - qVar.f16899d, strJ, 1));
    }

    public static void i0(AbstractC2505a abstractC2505a, String str, List validValues) throws InvalidTagValueException {
        kotlin.jvm.internal.j.g(validValues, "validValues");
        String str2 = abstractC2505a.c;
        String qrFieldId = str2 == null ? str : androidx.camera.core.impl.a.j(str2, ".", str);
        String strP = P(str, abstractC2505a);
        if (strP == null) {
            kotlin.jvm.internal.j.g(qrFieldId, "qrFieldId");
            throw new InvalidTagValueException(qrFieldId, (String) null, "Missing tag=".concat(qrFieldId));
        }
        if (validValues.contains(strP)) {
            return;
        }
        kotlin.jvm.internal.j.g(qrFieldId, "qrFieldId");
        throw new InvalidTagValueException(qrFieldId, strP, We.s.k("Unrecognized value=", strP, " for tag=", qrFieldId));
    }

    public static CharSequence j(int i4, CharSequence... charSequenceArr) {
        CharSequence charSequenceConcat = "";
        for (CharSequence charSequence : charSequenceArr) {
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new G5.w(5, 30, i4), 0, charSequence.length(), 0);
            charSequenceConcat = TextUtils.concat(charSequenceConcat, spannableString);
        }
        return charSequenceConcat;
    }

    public static void j0(AbstractC2505a abstractC2505a, String str, int i4, int i6) throws InvalidTagValueException {
        String str2 = abstractC2505a.c;
        String qrFieldId = str2 == null ? str : androidx.camera.core.impl.a.j(str2, ".", str);
        String strP = P(str, abstractC2505a);
        if (strP == null) {
            kotlin.jvm.internal.j.g(qrFieldId, "qrFieldId");
            throw new InvalidTagValueException(qrFieldId, (String) null, "Missing tag=".concat(qrFieldId));
        }
        int length = strP.length();
        if (i4 > length || length > i6) {
            throw E0(qrFieldId, strP);
        }
    }

    public static CharSequence k(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        CharSequence charSequenceConcat = "";
        while (it.hasNext()) {
            CharSequence charSequence = (CharSequence) it.next();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new G5.w(5, 10, 0), 0, charSequence.length(), 0);
            charSequenceConcat = TextUtils.concat(charSequenceConcat, spannableString);
        }
        return charSequenceConcat;
    }

    public static String k0(String str) {
        return "**** **** **** " + str.substring(str.length() - 4);
    }

    public static File l(File file) {
        try {
            return File.createTempFile("img_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()), ".jpg", file);
        } catch (Exception unused) {
            yk.a.d();
            return null;
        }
    }

    public static void l0(File file, Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
        try {
            byte[] bArr = new byte[1024];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file.getAbsoluteFile()));
            while (true) {
                int i4 = bufferedInputStream.read(bArr, 0, 1024);
                if (i4 == -1) {
                    break;
                } else if (outputStreamOpenOutputStream != null) {
                    outputStreamOpenOutputStream.write(bArr, 0, i4);
                }
            }
            if (outputStreamOpenOutputStream != null) {
                outputStreamOpenOutputStream.flush();
            }
            bufferedInputStream.close();
            Unit unit = Unit.f18162a;
            AbstractC0617a.p(outputStreamOpenOutputStream, null);
        } finally {
        }
    }

    public static String m(TransferAppLink transferAppLink) {
        return AbstractC1414e.h("https://www.paymaya.com/app/sendmoney?p=", Uri.encode(Base64Utils.encodeUrlSafe(A.f10366a.k(transferAppLink).getBytes())));
    }

    public static String m0(String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        if (str.startsWith("https://")) {
            return str;
        }
        if (!str.startsWith("http://")) {
            return "https://".concat(str);
        }
        return "https://" + str.substring(7);
    }

    public static String n(long j6, String str, String str2) {
        StringBuilder sbX = We.s.x("paymaya://vouchers?code=", str, "&campaign_name=", Uri.encode(Base64Utils.encodeUrlSafe(str2.getBytes())), "&time=");
        sbX.append(j6);
        return sbX.toString();
    }

    public static void n0(AbstractC2505a abstractC2505a, String str, int i4) throws InvalidTagValueException {
        String strP = P(str, abstractC2505a);
        if (strP == null) {
            return;
        }
        String str2 = abstractC2505a.c;
        if (str2 != null) {
            str = androidx.camera.core.impl.a.j(str2, ".", str);
        }
        int length = strP.length();
        if (1 > length || length > i4) {
            throw E0(str, strP);
        }
    }

    public static String o(String str, byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(bArr);
        byte[] bArrDigest = messageDigest.digest();
        StringBuilder sb2 = new StringBuilder();
        for (int i4 = 0; i4 < bArrDigest.length; i4++) {
            if (i4 != 0) {
                sb2.append(Global.COLON);
            }
            String hexString = Integer.toHexString(bArrDigest[i4] & 255);
            if (hexString.length() == 1) {
                sb2.append("0");
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    public static final Map o0(Object obj) {
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Pair(String.valueOf(entry.getKey()), String.valueOf(entry.getValue())));
        }
        return cj.M.l(arrayList);
    }

    public static final String p(String str) {
        if (str == null) {
            str = "";
        }
        if (AbstractC1213b.U("^(\\+?63)?[0-9]{10}$", str)) {
            String strSubstring = str.substring(0, 3);
            kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
            String strSubstring2 = str.substring(3, 6);
            kotlin.jvm.internal.j.f(strSubstring2, "substring(...)");
            String strSubstring3 = str.substring(6, 9);
            kotlin.jvm.internal.j.f(strSubstring3, "substring(...)");
            String strSubstring4 = str.substring(9);
            kotlin.jvm.internal.j.f(strSubstring4, "substring(...)");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strSubstring);
            sb2.append(Global.BLANK);
            sb2.append(strSubstring2);
            sb2.append(Global.BLANK);
            sb2.append(strSubstring3);
            return We.s.p(sb2, Global.BLANK, strSubstring4);
        }
        if (!AbstractC1213b.U("^(0)?[0-9]{10}$", str)) {
            return str;
        }
        String strSubstring5 = str.substring(0, 4);
        kotlin.jvm.internal.j.f(strSubstring5, "substring(...)");
        String strSubstring6 = str.substring(4, 7);
        kotlin.jvm.internal.j.f(strSubstring6, "substring(...)");
        String strSubstring7 = str.substring(7);
        kotlin.jvm.internal.j.f(strSubstring7, "substring(...)");
        return strSubstring5 + Global.BLANK + strSubstring6 + Global.BLANK + strSubstring7;
    }

    public static final String p0(String str) {
        kotlin.jvm.internal.j.g(str, "<this>");
        return zj.z.t(str, Global.BLANK, "");
    }

    public static String q(String mobileNumber) {
        kotlin.jvm.internal.j.g(mobileNumber, "mobileNumber");
        if (AbstractC1213b.U("^(63|0)[0-9]{10}$", zj.z.t(p0(C2576A.b0(mobileNumber).toString()), "+", ""))) {
            return AbstractC1213b.M("^(63)", zj.z.t(p0(C2576A.b0(mobileNumber).toString()), "+", ""), "0");
        }
        return null;
    }

    public static Double q0(String str) {
        try {
            return Double.valueOf(Double.parseDouble(str.trim().replaceAll("[^\\d.]", "")));
        } catch (NullPointerException | NumberFormatException unused) {
            return Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
        }
    }

    public static String r(String str) {
        String strA = "";
        C1757b c1757bB = C1757b.b();
        try {
            strA = c1757bB.a(c1757bB.i(str, "PH"), 1);
            yk.a.a();
            yk.a.a();
            return strA;
        } catch (NumberParseException e7) {
            e7.toString();
            yk.a.d();
            yk.a.a();
            return strA;
        }
    }

    public static void r0(View view, Function0 function0) {
        kotlin.jvm.internal.j.g(view, "<this>");
        view.setOnClickListener(new Ke.a(1, function0));
    }

    public static String s(String str) {
        C1757b c1757bB = C1757b.b();
        try {
            return c1757bB.a(c1757bB.i(str, "PH"), 2);
        } catch (NumberParseException e7) {
            e7.toString();
            yk.a.d();
            return str;
        }
    }

    public static void s0(com.paymaya.data.preference.a preference, String str, boolean z4) {
        String strConcat;
        kotlin.jvm.internal.j.g(preference, "preference");
        M[] mArrValues = M.values();
        ArrayList arrayList = new ArrayList(mArrValues.length);
        for (M m2 : mArrValues) {
            arrayList.add(m2.f10425a);
        }
        if (str.length() != 0 && arrayList.contains(str)) {
            M[] mArr = M.f10424b;
            if (str.equals("LANDERS")) {
                if (z4) {
                    L[] lArr = L.f10423a;
                    strConcat = str.concat("_CC_ONBOARDING");
                } else {
                    L[] lArr2 = L.f10423a;
                    strConcat = str.concat("_CC_REFERRAL");
                }
            } else if (z4) {
                L[] lArr3 = L.f10423a;
                strConcat = str.concat("_ONBOARDING");
            } else {
                L[] lArr4 = L.f10423a;
                strConcat = str.concat("_REFERRAL");
            }
        } else {
            strConcat = "";
        }
        preference.e0(strConcat);
        preference.t0(false);
    }

    public static String t(String mobileNumber) {
        kotlin.jvm.internal.j.g(mobileNumber, "mobileNumber");
        String strS = s(mobileNumber);
        kotlin.jvm.internal.j.d(strS);
        String[] strArr = (String[]) C2576A.T(strS, new String[]{Global.BLANK}, 6).toArray(new String[0]);
        return strArr[0] + Global.HYPHEN + strArr[1] + Global.HYPHEN + strArr[2] + strArr[3];
    }

    public static final void t0(BottomSheetDialogFragment bottomSheetDialogFragment, FragmentManager fragmentManager, String str) {
        Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(str);
        if (fragmentFindFragmentByTag == null || !fragmentFindFragmentByTag.isAdded()) {
            bottomSheetDialogFragment.show(fragmentManager, str);
        }
    }

    public static String u(Double d10) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        decimalFormatSymbols.setCurrencySymbol("");
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return currencyInstance.format(d10);
    }

    public static void u0(FragmentActivity fragmentActivity, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) fragmentActivity.getSystemService("input_method");
        if (inputMethodManager == null || view == null) {
            return;
        }
        inputMethodManager.showSoftInput(view, 1);
    }

    public static String v(String str) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        decimalFormatSymbols.setCurrencySymbol("");
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        try {
            return currencyInstance.format(Double.parseDouble(str));
        } catch (Exception e7) {
            e7.toString();
            yk.a.d();
            return str;
        }
    }

    public static void v0(TextView textView) {
        textView.setPaintFlags(textView.getPaintFlags() | 16);
    }

    public static int w(String str) {
        if (str != null && str.length() != 0) {
            String strG = g(str);
            int iIndexOf = strG.indexOf(Global.QUESTION);
            if (iIndexOf != -1) {
                strG = strG.substring(0, iIndexOf);
            }
            for (int i4 : AbstractC2217b.d(109)) {
                if (strG.equals(AbstractC1213b.x(i4))) {
                    return i4;
                }
            }
        }
        return 0;
    }

    public static void w0(T t5, String str, String str2) throws MayaQRErrorException {
        if (str == null || str.isEmpty() || str.equals("***")) {
            return;
        }
        B0(t5, str, "^[A-Za-z0-9_~`!@#$%^&*()\\-\\+={}\\[\\]\\\\|:;\"'<>,.?/Ññ ]+$", str2);
    }

    public static String x(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(C2581c.f21468b);
            kotlin.jvm.internal.j.f(bytes, "getBytes(...)");
            return String.format("%032X", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest.digest(bytes))}, 1));
        } catch (NoSuchAlgorithmException e7) {
            e7.printStackTrace();
            return "";
        }
    }

    public static final String x0(String str) {
        if (str.length() > 32) {
            String strSubstring = str.substring(0, 32);
            kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
            String strSubstring2 = str.substring(32);
            kotlin.jvm.internal.j.f(strSubstring2, "substring(...)");
            if (strSubstring.equals(x(strSubstring2))) {
                return strSubstring2;
            }
        }
        yk.a.a();
        return "";
    }

    public static final String y(String input) {
        kotlin.jvm.internal.j.g(input, "input");
        return x(input).concat(input);
    }

    public static void y0(String str, T t5, List list, String str2) throws MayaQRErrorException {
        if (str != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(str)) {
                    return;
                }
            }
        }
        String str3 = t5.c;
        yk.a.a();
        a0[] a0VarArr = a0.f10692a;
        throw new MayaQRErrorException(t5, "invalidValue", str, str2);
    }

    public static String z(String str, String str2, String str3, String str4, long j6) {
        return Uri.parse(C2576A.N(str, "/")).buildUpon().appendQueryParameter(PlayMayaWebViewParameters.PARAMETER_EXTERNAL_PROFILE_ID, str2).appendQueryParameter(PlayMayaWebViewParameters.PARAMETER_USER_TOKEN, str3).appendQueryParameter(PlayMayaWebViewParameters.PARAMETER_ACCESS_TOKEN, str4).appendQueryParameter("timestamp", String.valueOf(j6)).toString();
    }

    public static void z0(String str, T t5, boolean z4, int i4, int i6, String str2) throws MayaQRErrorException {
        if (str == null || "null".equals(str)) {
            if (z4) {
                String str3 = t5.c;
                yk.a.a();
                a0[] a0VarArr = a0.f10692a;
                throw new MayaQRErrorException(t5, "missingRequiredField", null, str2);
            }
            return;
        }
        if (str.length() < Math.max(i4, 1) || str.length() > i6) {
            String str4 = t5.c;
            yk.a.a();
            a0[] a0VarArr2 = a0.f10692a;
            throw new MayaQRErrorException(t5, "invalidLength", str, str2);
        }
    }
}
