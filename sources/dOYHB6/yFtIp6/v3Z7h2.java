package dOYHB6.yFtIp6;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes6.dex */
public class v3Z7h2 extends Toast {
    private static final int MAX_POPUP_LINES = 10;

    public v3Z7h2(Context context) {
        super(context);
    }

    public static Toast xw9V08(Context context, CharSequence charSequence, boolean z4) {
        if (z4) {
            return Toast.makeText(context, charSequence, 1);
        }
        Toast toast = new Toast(context);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(numX49.tnTj78("bHfb"));
        Resources system = Resources.getSystem();
        String strTnTj78 = numX49.tnTj78("bHf2");
        String strTnTj782 = numX49.tnTj78("bHfL");
        String strTnTj783 = numX49.tnTj78("bHfr");
        View viewInflate = layoutInflater.inflate(system.getIdentifier(strTnTj78, strTnTj782, strTnTj783), (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(Resources.getSystem().getIdentifier(numX49.tnTj78("bHfZ"), numX49.tnTj78("bHfk"), strTnTj783));
        textView.setMaxLines(10);
        textView.setText(charSequence);
        toast.setView(viewInflate);
        toast.setDuration(1);
        return toast;
    }
}
