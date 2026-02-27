package androidx.transition;

import We.s;
import android.view.View;
import androidx.annotation.NonNull;
import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TransitionValues {
    public View view;
    public final Map<String, Object> values = new HashMap();
    final ArrayList<Transition> mTargetedTransitions = new ArrayList<>();

    @Deprecated
    public TransitionValues() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.view == transitionValues.view && this.values.equals(transitionValues.values);
    }

    public int hashCode() {
        return this.values.hashCode() + (this.view.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbV = s.v("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbV.append(this.view);
        sbV.append(Global.NEWLINE);
        String strI = s.i(sbV.toString(), "    values:");
        for (String str : this.values.keySet()) {
            strI = strI + "    " + str + ": " + this.values.get(str) + Global.NEWLINE;
        }
        return strI;
    }

    public TransitionValues(@NonNull View view) {
        this.view = view;
    }
}
