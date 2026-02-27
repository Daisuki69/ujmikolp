package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.dynatrace.android.callback.Callback;
import dOYHB6.lN8Dz0.d8NVX3;
import dOYHB6.lN8Dz0.yf3D09;

/* JADX INFO: loaded from: classes.dex */
public class ListFragment extends Fragment {
    static final int INTERNAL_EMPTY_ID = 16711681;
    static final int INTERNAL_LIST_CONTAINER_ID = 16711683;
    static final int INTERNAL_PROGRESS_CONTAINER_ID = 16711682;
    ListAdapter mAdapter;
    CharSequence mEmptyText;
    View mEmptyView;
    ListView mList;
    View mListContainer;
    boolean mListShown;
    View mProgressContainer;
    TextView mStandardEmptyView;
    private final Handler mHandler = new Handler();
    private final Runnable mRequestFocus = new Runnable() { // from class: androidx.fragment.app.ListFragment.1
        @Override // java.lang.Runnable
        public void run() {
            ListView listView = ListFragment.this.mList;
            listView.focusableViewAvailable(listView);
        }
    };
    private final AdapterView.OnItemClickListener mOnClickListener = new AdapterView.OnItemClickListener() { // from class: androidx.fragment.app.ListFragment.2
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Callback.onItemClick_enter(view, i);
            try {
                ListFragment.this.onListItemClick((ListView) adapterView, view, i, j);
            } finally {
                Callback.onItemClick_exit();
            }
        }
    };

    private void ensureList() {
        if (this.mList != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.mList = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(INTERNAL_EMPTY_ID);
            this.mStandardEmptyView = textView;
            if (textView == null) {
                this.mEmptyView = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.mProgressContainer = view.findViewById(INTERNAL_PROGRESS_CONTAINER_ID);
            this.mListContainer = view.findViewById(INTERNAL_LIST_CONTAINER_ID);
            View viewFindViewById = view.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) viewFindViewById;
            this.mList = listView;
            View view2 = this.mEmptyView;
            if (view2 != null) {
                listView.setEmptyView(view2);
            } else {
                CharSequence charSequence = this.mEmptyText;
                if (charSequence != null) {
                    this.mStandardEmptyView.setText(charSequence);
                    this.mList.setEmptyView(this.mStandardEmptyView);
                }
            }
        }
        this.mListShown = true;
        this.mList.setOnItemClickListener(this.mOnClickListener);
        ListAdapter listAdapter = this.mAdapter;
        if (listAdapter != null) {
            this.mAdapter = null;
            setListAdapter(listAdapter);
        } else if (this.mProgressContainer != null) {
            setListShown(false, false);
        }
        this.mHandler.post(this.mRequestFocus);
    }

    @Nullable
    public ListAdapter getListAdapter() {
        return this.mAdapter;
    }

    @NonNull
    public ListView getListView() {
        ensureList();
        return this.mList;
    }

    public long getSelectedItemId() {
        ensureList();
        return this.mList.getSelectedItemId();
    }

    public int getSelectedItemPosition() {
        ensureList();
        return this.mList.getSelectedItemPosition();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Context contextRequireContext = requireContext();
        yf3D09 yf3d09 = new yf3D09(contextRequireContext);
        d8NVX3 d8nvx3 = new d8NVX3(contextRequireContext);
        d8nvx3.setId(INTERNAL_PROGRESS_CONTAINER_ID);
        d8nvx3.setOrientation(1);
        d8nvx3.setVisibility(8);
        d8nvx3.setGravity(17);
        d8nvx3.addView(new ProgressBar(contextRequireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        yf3d09.addView(d8nvx3, new FrameLayout.LayoutParams(-1, -1));
        yf3D09 yf3d092 = new yf3D09(contextRequireContext);
        yf3d092.setId(INTERNAL_LIST_CONTAINER_ID);
        TextView textView = new TextView(contextRequireContext);
        textView.setId(INTERNAL_EMPTY_ID);
        textView.setGravity(17);
        yf3d092.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(contextRequireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        yf3d092.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        yf3d09.addView(yf3d092, new FrameLayout.LayoutParams(-1, -1));
        yf3d09.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return yf3d09;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.mHandler.removeCallbacks(this.mRequestFocus);
        this.mList = null;
        this.mListShown = false;
        this.mListContainer = null;
        this.mProgressContainer = null;
        this.mEmptyView = null;
        this.mStandardEmptyView = null;
        super.onDestroyView();
    }

    public void onListItemClick(@NonNull ListView listView, @NonNull View view, int i, long j) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        ensureList();
    }

    @NonNull
    public final ListAdapter requireListAdapter() {
        ListAdapter listAdapter = getListAdapter();
        if (listAdapter != null) {
            return listAdapter;
        }
        throw new IllegalStateException("ListFragment " + this + " does not have a ListAdapter.");
    }

    public void setEmptyText(@Nullable CharSequence charSequence) {
        ensureList();
        TextView textView = this.mStandardEmptyView;
        if (textView == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        textView.setText(charSequence);
        if (this.mEmptyText == null) {
            this.mList.setEmptyView(this.mStandardEmptyView);
        }
        this.mEmptyText = charSequence;
    }

    public void setListAdapter(@Nullable ListAdapter listAdapter) {
        boolean z4 = this.mAdapter != null;
        this.mAdapter = listAdapter;
        ListView listView = this.mList;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.mListShown || z4) {
                return;
            }
            setListShown(true, requireView().getWindowToken() != null);
        }
    }

    public void setListShown(boolean z4) {
        setListShown(z4, true);
    }

    public void setListShownNoAnimation(boolean z4) {
        setListShown(z4, false);
    }

    public void setSelection(int i) {
        ensureList();
        this.mList.setSelection(i);
    }

    private void setListShown(boolean z4, boolean z5) {
        ensureList();
        View view = this.mProgressContainer;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.mListShown == z4) {
            return;
        }
        this.mListShown = z4;
        if (z4) {
            if (z5) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                this.mListContainer.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.mListContainer.clearAnimation();
            }
            this.mProgressContainer.setVisibility(8);
            this.mListContainer.setVisibility(0);
            return;
        }
        if (z5) {
            view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            this.mListContainer.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.mListContainer.clearAnimation();
        }
        this.mProgressContainer.setVisibility(0);
        this.mListContainer.setVisibility(8);
    }
}
