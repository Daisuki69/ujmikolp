package t4;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static View a(View view) {
        if (b(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View viewA = a(viewGroup.getChildAt(i));
                if (viewA != null) {
                    return viewA;
                }
            }
        }
        return null;
    }

    public static boolean b(View view) {
        return (view instanceof ListView) || (view instanceof ScrollView) || (view instanceof ScrollingView) || (view instanceof WebView) || view.canScrollVertically(-1) || view.canScrollVertically(1);
    }
}
