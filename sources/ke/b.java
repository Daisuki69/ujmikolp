package Ke;

import android.os.Build;
import android.view.View;
import androidx.core.view.ViewCompat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final void a(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            ViewCompat.setOnApplyWindowInsetsListener(view, new C2.f(6));
        }
    }

    public static void b(View view, Function0 function0) {
        j.g(view, "<this>");
        view.setOnClickListener(new a(0, function0));
    }
}
