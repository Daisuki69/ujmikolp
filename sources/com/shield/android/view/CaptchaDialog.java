package com.shield.android.view;

import Ke.e;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.CaptchaType;
import com.shield.android.R;
import com.shield.android.internal.i;
import com.shield.android.k.a;
import com.shield.android.view.CaptchaDialog;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class CaptchaDialog extends Activity {
    public static final String CAPTCHA_BROADCAST = numX49.tnTj78("bOCr");
    public static final String QUITTABLE = numX49.tnTj78("bOCZ");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15504d = {1998339218, 2005792963, 1734429202, 612344468, 750523632, 1407197171, 2002234266, 1812858668};
    private LocalBroadcastManager jJ;
    private ImageView jK;
    private EditText jL;
    private TextView jM;
    private TextView jN;
    private TextView jO;
    private CaptchaType jI = CaptchaType.TEXT_CAPTCHA;
    private String jP = g(numX49.tnTj78("bOCk"));
    private int jQ = -1;
    private int jR = ((int) f15504d[0]) ^ 1998339218;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public /* synthetic */ void cB() {
        Intent intent = new Intent(g(numX49.tnTj78("bOCV")));
        intent.putExtra(g(numX49.tnTj78("bOCS")), ((int) f15504d[1]) ^ 2005792962);
        this.jJ.sendBroadcast(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public /* synthetic */ void cC() {
        Intent intent = new Intent(g(numX49.tnTj78("bOCj")));
        intent.putExtra(g(numX49.tnTj78("bOCd")), ((int) f15504d[1]) ^ 2005792962);
        this.jJ.sendBroadcast(intent);
        finish();
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15504d[0]) ^ 1998339218;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15504d;
            long j = jArr[7];
            long j6 = jArr[1];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 1812899021) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 1812899021) + (((int) j6) ^ 2005792962), i4 | (~(((int) j) ^ 1812899021)), i6, (((int) j) ^ 1812899021) + cCharAt + (((int) j6) ^ 2005792962) + ((~(((int) j) ^ 1812899021)) | i4)));
            long j7 = f15504d[1];
            int i10 = ~i;
            i = i + (((int) j7) ^ 2005792962) + (((int) j7) ^ 2005792962) + ((~(((int) j7) ^ 2005792962)) | i10) + (((((int) j7) ^ 2005792962) + i) - ((((((int) j7) ^ 2005792962) + i) + (((int) j7) ^ 2005792962)) + ((~(((int) j7) ^ 2005792962)) | i10)));
        }
        return sb2.toString();
    }

    public static Intent getCaptchaIntent(Context context, CaptchaType captchaType, boolean z4) {
        Intent intent = new Intent(context, (Class<?>) CaptchaDialog.class);
        intent.putExtra(g(numX49.tnTj78("bOCi")), captchaType);
        intent.putExtra(g(numX49.tnTj78("bOCE")), z4);
        return intent;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        super.onCreate(bundle);
        requestWindowFeature(((int) f15504d[1]) ^ 2005792962);
        setContentView(R.layout.dialog_captcha);
        setFinishOnTouchOutside(((int) f15504d[0]) ^ 1998339218);
        this.jJ = LocalBroadcastManager.getInstance(this);
        this.jK = (ImageView) findViewById(R.id.captchaImage);
        this.jL = (EditText) findViewById(R.id.captchaEditText);
        this.jM = (TextView) findViewById(R.id.subtitle);
        this.jN = (TextView) findViewById(R.id.title);
        this.jO = (TextView) findViewById(R.id.error);
        try {
            this.jI = (CaptchaType) getIntent().getSerializableExtra(g("ꎂꎀꎑꎕꎂꎉꎀꎾꎕꎘꎑꎄ"));
        } catch (Exception e) {
            a.dL().a(e);
        }
        CaptchaType captchaType = this.jI;
        if (captchaType == CaptchaType.TEXT_CAPTCHA) {
            this.jN.setText(g(numX49.tnTj78("bOCF")));
            this.jM.setText(R.string.label_captcha_subtitle);
            this.jO.setText(R.string.label_captcha_message);
            String strBS = i.bS();
            this.jP = strBS;
            this.jK.setImageBitmap(i.m(strBS));
        } else if (captchaType == CaptchaType.MATH_CHALLENGE) {
            this.jN.setText(g(numX49.tnTj78("bOCH")));
            this.jM.setText(R.string.label_challenge_subtitle);
            this.jO.setText(R.string.label_challenge_message);
            this.jL.setInputType(((int) f15504d[2]) ^ 1734429200);
            int iNextInt = new Random().nextInt(((int) f15504d[3]) ^ 612344478);
            int iNextInt2 = new Random().nextInt(((int) f15504d[3]) ^ 612344478);
            int i = iNextInt + iNextInt2;
            int i4 = (((int) f15504d[1]) ^ 2005792962) + i + ((~iNextInt) | (~iNextInt2));
            this.jQ = (i - i4) + i4;
            this.jK.setImageBitmap(i.a(iNextInt, iNextInt2));
        }
        this.jL.setOnEditorActionListener(new e(this, 2));
    }

    @Override // android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        iKNpI8.pX3PN6(this);
        super.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        iKNpI8.xoZZl9(this);
        super.onStop();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zZN5YC5 = hxOD26.zN5YC5(motionEvent);
        return !zZN5YC5 ? super.onTouchEvent(motionEvent) : zZN5YC5;
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        iKNpI8.fBndJ9(this);
        super.onUserInteraction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public /* synthetic */ boolean a(TextView textView, int i, KeyEvent keyEvent) {
        long j;
        long[] jArr = f15504d;
        if (i == (((int) jArr[4]) ^ 750523638)) {
            CaptchaType captchaType = this.jI;
            CaptchaType captchaType2 = CaptchaType.TEXT_CAPTCHA;
            String strTnTj78 = numX49.tnTj78("bOCB");
            String strTnTj782 = numX49.tnTj78("bOCu");
            if (captchaType != captchaType2) {
                try {
                    if (Integer.parseInt(this.jL.getText().toString()) != this.jQ) {
                        int i4 = this.jR;
                        long[] jArr2 = f15504d;
                        int i6 = i4 + (((int) jArr2[1]) ^ 2005792962);
                        this.jR = i6;
                        if (i6 > (((int) jArr2[5]) ^ 1407197168)) {
                            Intent intent = new Intent(g(strTnTj782));
                            intent.putExtra(g(strTnTj78), ((int) f15504d[0]) ^ 1998339218);
                            this.jJ.sendBroadcast(intent);
                            finish();
                        }
                        this.jO.setVisibility(((int) f15504d[0]) ^ 1998339218);
                        int iNextInt = new Random().nextInt(((int) f15504d[3]) ^ 612344478);
                        int iNextInt2 = new Random().nextInt(((int) f15504d[3]) ^ 612344478);
                        int i10 = iNextInt + iNextInt2;
                        int i11 = (((int) f15504d[1]) ^ 2005792962) + i10 + ((~iNextInt) | (~iNextInt2));
                        this.jQ = i11 + (i10 - i11);
                        this.jK.setImageBitmap(i.a(iNextInt, iNextInt2));
                    } else {
                        final int i12 = 1;
                        new Handler().postDelayed(new Runnable(this) { // from class: Ve.a

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ CaptchaDialog f6102b;

                            {
                                this.f6102b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        this.f6102b.cC();
                                        break;
                                    default:
                                        this.f6102b.cB();
                                        break;
                                }
                            }
                        }, 2002234194 ^ f15504d[6]);
                    }
                } catch (Exception e) {
                    a.dL().a(e);
                }
            } else if (this.jL.getText().toString().equals(this.jP)) {
                final int i13 = 0;
                new Handler().postDelayed(new Runnable(this) { // from class: Ve.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CaptchaDialog f6102b;

                    {
                        this.f6102b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                this.f6102b.cC();
                                break;
                            default:
                                this.f6102b.cB();
                                break;
                        }
                    }
                }, 2002234194 ^ f15504d[6]);
            } else {
                int i14 = this.jR;
                long[] jArr3 = f15504d;
                int i15 = i14 + (((int) jArr3[1]) ^ 2005792962);
                this.jR = i15;
                if (i15 > (((int) jArr3[5]) ^ 1407197168)) {
                    Intent intent2 = new Intent(g(strTnTj782));
                    intent2.putExtra(g(strTnTj78), ((int) f15504d[0]) ^ 1998339218);
                    this.jJ.sendBroadcast(intent2);
                    finish();
                }
                this.jO.setVisibility(((int) f15504d[0]) ^ 1998339218);
                String strBS = i.bS();
                this.jP = strBS;
                this.jK.setImageBitmap(i.m(strBS));
            }
            j = f15504d[0];
        } else {
            j = jArr[0];
        }
        return ((int) j) ^ 1998339218;
    }
}
