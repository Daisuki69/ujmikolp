package org.opencv.android;

import Ci.b;
import F1.p;
import Rg.u;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    public static void a(FragmentActivity fragmentActivity, u uVar) {
        b bVar = new b(13);
        p pVar = new p(bVar, 2);
        bVar.f = pVar;
        bVar.f786d = "3.0.0";
        bVar.c = uVar;
        bVar.e = fragmentActivity;
        Intent intent = new Intent("org.opencv.engine.BIND");
        intent.setPackage("org.opencv.engine");
        if (fragmentActivity.bindService(intent, pVar, 1)) {
            return;
        }
        fragmentActivity.unbindService(pVar);
        b.a(fragmentActivity, uVar);
    }

    public static boolean b() {
        return StaticHelper.a();
    }
}
