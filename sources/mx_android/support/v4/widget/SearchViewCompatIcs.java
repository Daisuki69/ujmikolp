package mx_android.support.v4.widget;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SearchView;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;

/* JADX INFO: loaded from: classes7.dex */
class SearchViewCompatIcs {
    SearchViewCompatIcs() {
    }

    public static class MySearchView extends SearchView {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            Context context = getContext();
            hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
            return super.onInterceptTouchEvent(motionEvent);
        }

        public MySearchView(Context context) {
            super(context);
        }

        @Override // android.widget.SearchView, android.view.CollapsibleActionView
        public void onActionViewCollapsed() {
            setQuery("", false);
            super.onActionViewCollapsed();
        }
    }

    public static View newSearchView(Context context) {
        return new MySearchView(context);
    }

    public static void setImeOptions(View view, int i) {
        ((SearchView) view).setImeOptions(i);
    }

    public static void setInputType(View view, int i) {
        ((SearchView) view).setInputType(i);
    }
}
