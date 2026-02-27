package mx_android.support.v4.app;

import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.dynatrace.android.agent.Global;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import mx_android.support.v4.app.FragmentManager;
import mx_android.support.v4.app.FragmentTransitionCompat21;
import mx_android.support.v4.util.ArrayMap;
import mx_android.support.v4.util.LogWriter;

/* JADX INFO: loaded from: classes7.dex */
final class BackStackRecord extends FragmentTransaction implements FragmentManager.BackStackEntry, Runnable {
    static final int OP_ADD = 1;
    static final int OP_ATTACH = 7;
    static final int OP_DETACH = 6;
    static final int OP_HIDE = 4;
    static final int OP_NULL = 0;
    static final int OP_REMOVE = 3;
    static final int OP_REPLACE = 2;
    static final int OP_SHOW = 5;
    static final String TAG = "FragmentManager";
    boolean mAddToBackStack;
    int mBreadCrumbShortTitleRes;
    CharSequence mBreadCrumbShortTitleText;
    int mBreadCrumbTitleRes;
    CharSequence mBreadCrumbTitleText;
    boolean mCommitted;
    int mEnterAnim;
    int mExitAnim;
    Op mHead;
    final FragmentManagerImpl mManager;
    String mName;
    int mNumOp;
    int mPopEnterAnim;
    int mPopExitAnim;
    ArrayList<String> mSharedElementSourceNames;
    ArrayList<String> mSharedElementTargetNames;
    Op mTail;
    int mTransition;
    int mTransitionStyle;
    boolean mAllowAddToBackStack = true;
    int mIndex = -1;

    static final class Op {
        int cmd;
        int enterAnim;
        int exitAnim;
        Fragment fragment;
        Op next;
        int popEnterAnim;
        int popExitAnim;
        Op prev;
        ArrayList<Fragment> removed;

        Op() {
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.mIndex >= 0) {
            sb2.append(" #");
            sb2.append(this.mIndex);
        }
        if (this.mName != null) {
            sb2.append(Global.BLANK);
            sb2.append(this.mName);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        dump(str, printWriter, true);
    }

    public void dump(String str, PrintWriter printWriter, boolean z4) {
        String str2;
        if (z4) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.mName);
            printWriter.print(" mIndex=");
            printWriter.print(this.mIndex);
            printWriter.print(" mCommitted=");
            printWriter.println(this.mCommitted);
            if (this.mTransition != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.mTransition));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.mTransitionStyle));
            }
            if (this.mEnterAnim != 0 || this.mExitAnim != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.mEnterAnim));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.mExitAnim));
            }
            if (this.mPopEnterAnim != 0 || this.mPopExitAnim != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.mPopEnterAnim));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.mPopExitAnim));
            }
            if (this.mBreadCrumbTitleRes != 0 || this.mBreadCrumbTitleText != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.mBreadCrumbTitleRes));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.mBreadCrumbTitleText);
            }
            if (this.mBreadCrumbShortTitleRes != 0 || this.mBreadCrumbShortTitleText != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.mBreadCrumbShortTitleRes));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.mBreadCrumbShortTitleText);
            }
        }
        if (this.mHead != null) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str3 = str + "    ";
            Op op = this.mHead;
            int i = 0;
            while (op != null) {
                switch (op.cmd) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    default:
                        str2 = "cmd=" + op.cmd;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(Global.BLANK);
                printWriter.println(op.fragment);
                if (z4) {
                    if (op.enterAnim != 0 || op.exitAnim != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(op.enterAnim));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(op.exitAnim));
                    }
                    if (op.popEnterAnim != 0 || op.popExitAnim != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(op.popEnterAnim));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(op.popExitAnim));
                    }
                }
                if (op.removed != null && op.removed.size() > 0) {
                    for (int i4 = 0; i4 < op.removed.size(); i4++) {
                        printWriter.print(str3);
                        if (op.removed.size() == 1) {
                            printWriter.print("Removed: ");
                        } else {
                            if (i4 == 0) {
                                printWriter.println("Removed:");
                            }
                            printWriter.print(str3);
                            printWriter.print("  #");
                            printWriter.print(i4);
                            printWriter.print(": ");
                        }
                        printWriter.println(op.removed.get(i4));
                    }
                }
                op = op.next;
                i++;
            }
        }
    }

    public BackStackRecord(FragmentManagerImpl fragmentManagerImpl) {
        this.mManager = fragmentManagerImpl;
    }

    @Override // mx_android.support.v4.app.FragmentManager.BackStackEntry
    public int getId() {
        return this.mIndex;
    }

    @Override // mx_android.support.v4.app.FragmentManager.BackStackEntry
    public int getBreadCrumbTitleRes() {
        return this.mBreadCrumbTitleRes;
    }

    @Override // mx_android.support.v4.app.FragmentManager.BackStackEntry
    public int getBreadCrumbShortTitleRes() {
        return this.mBreadCrumbShortTitleRes;
    }

    @Override // mx_android.support.v4.app.FragmentManager.BackStackEntry
    public CharSequence getBreadCrumbTitle() {
        if (this.mBreadCrumbTitleRes != 0) {
            return this.mManager.mActivity.getText(this.mBreadCrumbTitleRes);
        }
        return this.mBreadCrumbTitleText;
    }

    @Override // mx_android.support.v4.app.FragmentManager.BackStackEntry
    public CharSequence getBreadCrumbShortTitle() {
        if (this.mBreadCrumbShortTitleRes != 0) {
            return this.mManager.mActivity.getText(this.mBreadCrumbShortTitleRes);
        }
        return this.mBreadCrumbShortTitleText;
    }

    void addOp(Op op) {
        if (this.mHead == null) {
            this.mTail = op;
            this.mHead = op;
        } else {
            op.prev = this.mTail;
            this.mTail.next = op;
            this.mTail = op;
        }
        op.enterAnim = this.mEnterAnim;
        op.exitAnim = this.mExitAnim;
        op.popEnterAnim = this.mPopEnterAnim;
        op.popExitAnim = this.mPopExitAnim;
        this.mNumOp++;
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public FragmentTransaction add(Fragment fragment, String str) {
        doAddOp(0, fragment, str, 1);
        return this;
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public FragmentTransaction add(int i, Fragment fragment) {
        doAddOp(i, fragment, null, 1);
        return this;
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public FragmentTransaction add(int i, Fragment fragment, String str) {
        doAddOp(i, fragment, str, 1);
        return this;
    }

    private void doAddOp(int i, Fragment fragment, String str, int i4) {
        fragment.mFragmentManager = this.mManager;
        if (str != null) {
            if (fragment.mTag != null && !str.equals(fragment.mTag)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (fragment.mFragmentId != 0 && fragment.mFragmentId != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        Op op = new Op();
        op.cmd = i4;
        op.fragment = fragment;
        addOp(op);
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public FragmentTransaction replace(int i, Fragment fragment) {
        return replace(i, fragment, null);
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public FragmentTransaction replace(int i, Fragment fragment, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        doAddOp(i, fragment, str, 2);
        return this;
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public FragmentTransaction remove(Fragment fragment) {
        Op op = new Op();
        op.cmd = 3;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public FragmentTransaction hide(Fragment fragment) {
        Op op = new Op();
        op.cmd = 4;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public FragmentTransaction show(Fragment fragment) {
        Op op = new Op();
        op.cmd = 5;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public FragmentTransaction detach(Fragment fragment) {
        Op op = new Op();
        op.cmd = 6;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public FragmentTransaction attach(Fragment fragment) {
        Op op = new Op();
        op.cmd = 7;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public FragmentTransaction setCustomAnimations(int i, int i4) {
        return setCustomAnimations(i, i4, 0, 0);
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public FragmentTransaction setCustomAnimations(int i, int i4, int i6, int i10) {
        this.mEnterAnim = i;
        this.mExitAnim = i4;
        this.mPopEnterAnim = i6;
        this.mPopExitAnim = i10;
        return this;
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public FragmentTransaction setTransition(int i) {
        this.mTransition = i;
        return this;
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public FragmentTransaction addSharedElement(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            String transitionName = FragmentTransitionCompat21.getTransitionName(view);
            if (transitionName == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.mSharedElementSourceNames == null) {
                this.mSharedElementSourceNames = new ArrayList<>();
                this.mSharedElementTargetNames = new ArrayList<>();
            }
            this.mSharedElementSourceNames.add(transitionName);
            this.mSharedElementTargetNames.add(str);
        }
        return this;
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public FragmentTransaction setTransitionStyle(int i) {
        this.mTransitionStyle = i;
        return this;
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public FragmentTransaction addToBackStack(String str) {
        if (!this.mAllowAddToBackStack) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.mAddToBackStack = true;
        this.mName = str;
        return this;
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public boolean isAddToBackStackAllowed() {
        return this.mAllowAddToBackStack;
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public FragmentTransaction disallowAddToBackStack() {
        if (this.mAddToBackStack) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.mAllowAddToBackStack = false;
        return this;
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public FragmentTransaction setBreadCrumbTitle(int i) {
        this.mBreadCrumbTitleRes = i;
        this.mBreadCrumbTitleText = null;
        return this;
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public FragmentTransaction setBreadCrumbTitle(CharSequence charSequence) {
        this.mBreadCrumbTitleRes = 0;
        this.mBreadCrumbTitleText = charSequence;
        return this;
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public FragmentTransaction setBreadCrumbShortTitle(int i) {
        this.mBreadCrumbShortTitleRes = i;
        this.mBreadCrumbShortTitleText = null;
        return this;
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public FragmentTransaction setBreadCrumbShortTitle(CharSequence charSequence) {
        this.mBreadCrumbShortTitleRes = 0;
        this.mBreadCrumbShortTitleText = charSequence;
        return this;
    }

    void bumpBackStackNesting(int i) {
        if (this.mAddToBackStack) {
            if (FragmentManagerImpl.DEBUG) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            for (Op op = this.mHead; op != null; op = op.next) {
                if (op.fragment != null) {
                    op.fragment.mBackStackNesting += i;
                    if (FragmentManagerImpl.DEBUG) {
                        Log.v("FragmentManager", "Bump nesting of " + op.fragment + " to " + op.fragment.mBackStackNesting);
                    }
                }
                if (op.removed != null) {
                    for (int size = op.removed.size() - 1; size >= 0; size--) {
                        Fragment fragment = op.removed.get(size);
                        fragment.mBackStackNesting += i;
                        if (FragmentManagerImpl.DEBUG) {
                            Log.v("FragmentManager", "Bump nesting of " + fragment + " to " + fragment.mBackStackNesting);
                        }
                    }
                }
            }
        }
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public int commit() {
        return commitInternal(false);
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public int commitAllowingStateLoss() {
        return commitInternal(true);
    }

    int commitInternal(boolean z4) {
        if (this.mCommitted) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManagerImpl.DEBUG) {
            Log.v("FragmentManager", "Commit: " + this);
            dump("  ", null, new PrintWriter(new LogWriter("FragmentManager")), null);
        }
        this.mCommitted = true;
        if (this.mAddToBackStack) {
            this.mIndex = this.mManager.allocBackStackIndex(this);
        } else {
            this.mIndex = -1;
        }
        this.mManager.enqueueAction(this, z4);
        return this.mIndex;
    }

    @Override // java.lang.Runnable
    public void run() {
        TransitionState transitionStateBeginTransition;
        if (FragmentManagerImpl.DEBUG) {
            Log.v("FragmentManager", "Run: " + this);
        }
        if (this.mAddToBackStack && this.mIndex < 0) {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        bumpBackStackNesting(1);
        if (Build.VERSION.SDK_INT >= 21) {
            SparseArray<Fragment> sparseArray = new SparseArray<>();
            SparseArray<Fragment> sparseArray2 = new SparseArray<>();
            calculateFragments(sparseArray, sparseArray2);
            transitionStateBeginTransition = beginTransition(sparseArray, sparseArray2, false);
        } else {
            transitionStateBeginTransition = null;
        }
        int i = transitionStateBeginTransition != null ? 0 : this.mTransitionStyle;
        int i4 = transitionStateBeginTransition != null ? 0 : this.mTransition;
        for (Op op = this.mHead; op != null; op = op.next) {
            int i6 = transitionStateBeginTransition != null ? 0 : op.enterAnim;
            int i10 = transitionStateBeginTransition != null ? 0 : op.exitAnim;
            switch (op.cmd) {
                case 1:
                    Fragment fragment = op.fragment;
                    fragment.mNextAnim = i6;
                    this.mManager.addFragment(fragment, false);
                    break;
                case 2:
                    Fragment fragment2 = op.fragment;
                    if (this.mManager.mAdded != null) {
                        for (int i11 = 0; i11 < this.mManager.mAdded.size(); i11++) {
                            Fragment fragment3 = this.mManager.mAdded.get(i11);
                            if (FragmentManagerImpl.DEBUG) {
                                Log.v("FragmentManager", "OP_REPLACE: adding=" + fragment2 + " old=" + fragment3);
                            }
                            if (fragment2 == null || fragment3.mContainerId == fragment2.mContainerId) {
                                if (fragment3 == fragment2) {
                                    op.fragment = null;
                                    fragment2 = null;
                                } else {
                                    if (op.removed == null) {
                                        op.removed = new ArrayList<>();
                                    }
                                    op.removed.add(fragment3);
                                    fragment3.mNextAnim = i10;
                                    if (this.mAddToBackStack) {
                                        fragment3.mBackStackNesting++;
                                        if (FragmentManagerImpl.DEBUG) {
                                            Log.v("FragmentManager", "Bump nesting of " + fragment3 + " to " + fragment3.mBackStackNesting);
                                        }
                                    }
                                    this.mManager.removeFragment(fragment3, i4, i);
                                }
                            }
                        }
                    }
                    if (fragment2 != null) {
                        fragment2.mNextAnim = i6;
                        this.mManager.addFragment(fragment2, false);
                    }
                    break;
                case 3:
                    Fragment fragment4 = op.fragment;
                    fragment4.mNextAnim = i10;
                    this.mManager.removeFragment(fragment4, i4, i);
                    break;
                case 4:
                    Fragment fragment5 = op.fragment;
                    fragment5.mNextAnim = i10;
                    this.mManager.hideFragment(fragment5, i4, i);
                    break;
                case 5:
                    Fragment fragment6 = op.fragment;
                    fragment6.mNextAnim = i6;
                    this.mManager.showFragment(fragment6, i4, i);
                    break;
                case 6:
                    Fragment fragment7 = op.fragment;
                    fragment7.mNextAnim = i10;
                    this.mManager.detachFragment(fragment7, i4, i);
                    break;
                case 7:
                    Fragment fragment8 = op.fragment;
                    fragment8.mNextAnim = i6;
                    this.mManager.attachFragment(fragment8, i4, i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.cmd);
            }
        }
        FragmentManagerImpl fragmentManagerImpl = this.mManager;
        fragmentManagerImpl.moveToState(fragmentManagerImpl.mCurState, i4, i, true);
        if (this.mAddToBackStack) {
            this.mManager.addBackStackState(this);
        }
    }

    private static void setFirstOut(SparseArray<Fragment> sparseArray, Fragment fragment) {
        int i;
        if (fragment == null || (i = fragment.mContainerId) == 0 || fragment.isHidden() || !fragment.isAdded() || fragment.getView() == null || sparseArray.get(i) != null) {
            return;
        }
        sparseArray.put(i, fragment);
    }

    private void setLastIn(SparseArray<Fragment> sparseArray, Fragment fragment) {
        int i;
        if (fragment == null || (i = fragment.mContainerId) == 0) {
            return;
        }
        sparseArray.put(i, fragment);
    }

    private void calculateFragments(SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2) {
        if (this.mManager.mContainer.hasView()) {
            for (Op op = this.mHead; op != null; op = op.next) {
                switch (op.cmd) {
                    case 1:
                        setLastIn(sparseArray2, op.fragment);
                        break;
                    case 2:
                        Fragment fragment = op.fragment;
                        if (this.mManager.mAdded != null) {
                            for (int i = 0; i < this.mManager.mAdded.size(); i++) {
                                Fragment fragment2 = this.mManager.mAdded.get(i);
                                if (fragment == null || fragment2.mContainerId == fragment.mContainerId) {
                                    if (fragment2 == fragment) {
                                        fragment = null;
                                    } else {
                                        setFirstOut(sparseArray, fragment2);
                                    }
                                }
                            }
                        }
                        setLastIn(sparseArray2, fragment);
                        break;
                    case 3:
                        setFirstOut(sparseArray, op.fragment);
                        break;
                    case 4:
                        setFirstOut(sparseArray, op.fragment);
                        break;
                    case 5:
                        setLastIn(sparseArray2, op.fragment);
                        break;
                    case 6:
                        setFirstOut(sparseArray, op.fragment);
                        break;
                    case 7:
                        setLastIn(sparseArray2, op.fragment);
                        break;
                }
            }
        }
    }

    public void calculateBackFragments(SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2) {
        if (this.mManager.mContainer.hasView()) {
            for (Op op = this.mHead; op != null; op = op.next) {
                switch (op.cmd) {
                    case 1:
                        setFirstOut(sparseArray, op.fragment);
                        break;
                    case 2:
                        if (op.removed != null) {
                            for (int size = op.removed.size() - 1; size >= 0; size--) {
                                setLastIn(sparseArray2, op.removed.get(size));
                            }
                        }
                        setFirstOut(sparseArray, op.fragment);
                        break;
                    case 3:
                        setLastIn(sparseArray2, op.fragment);
                        break;
                    case 4:
                        setLastIn(sparseArray2, op.fragment);
                        break;
                    case 5:
                        setFirstOut(sparseArray, op.fragment);
                        break;
                    case 6:
                        setLastIn(sparseArray2, op.fragment);
                        break;
                    case 7:
                        setFirstOut(sparseArray, op.fragment);
                        break;
                }
            }
        }
    }

    public TransitionState popFromBackStack(boolean z4, TransitionState transitionState, SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2) {
        TransitionState transitionState2 = null;
        if (FragmentManagerImpl.DEBUG) {
            Log.v("FragmentManager", "popFromBackStack: " + this);
            dump("  ", null, new PrintWriter(new LogWriter("FragmentManager")), null);
        }
        if (transitionState == null) {
            if (sparseArray.size() != 0 || sparseArray2.size() != 0) {
                transitionState = beginTransition(sparseArray, sparseArray2, true);
            }
        } else if (!z4) {
            setNameOverrides(transitionState, this.mSharedElementTargetNames, this.mSharedElementSourceNames);
        }
        bumpBackStackNesting(-1);
        int i = transitionState != null ? 0 : this.mTransitionStyle;
        int i4 = transitionState != null ? 0 : this.mTransition;
        for (Op op = this.mTail; op != null; op = op.prev) {
            int i6 = transitionState != null ? 0 : op.popEnterAnim;
            int i10 = transitionState != null ? 0 : op.popExitAnim;
            switch (op.cmd) {
                case 1:
                    Fragment fragment = op.fragment;
                    fragment.mNextAnim = i10;
                    this.mManager.removeFragment(fragment, FragmentManagerImpl.reverseTransit(i4), i);
                    break;
                case 2:
                    Fragment fragment2 = op.fragment;
                    if (fragment2 != null) {
                        fragment2.mNextAnim = i10;
                        this.mManager.removeFragment(fragment2, FragmentManagerImpl.reverseTransit(i4), i);
                    }
                    if (op.removed != null) {
                        for (int i11 = 0; i11 < op.removed.size(); i11++) {
                            Fragment fragment3 = op.removed.get(i11);
                            fragment3.mNextAnim = i6;
                            this.mManager.addFragment(fragment3, false);
                        }
                    }
                    break;
                case 3:
                    Fragment fragment4 = op.fragment;
                    fragment4.mNextAnim = i6;
                    this.mManager.addFragment(fragment4, false);
                    break;
                case 4:
                    Fragment fragment5 = op.fragment;
                    fragment5.mNextAnim = i6;
                    this.mManager.showFragment(fragment5, FragmentManagerImpl.reverseTransit(i4), i);
                    break;
                case 5:
                    Fragment fragment6 = op.fragment;
                    fragment6.mNextAnim = i10;
                    this.mManager.hideFragment(fragment6, FragmentManagerImpl.reverseTransit(i4), i);
                    break;
                case 6:
                    Fragment fragment7 = op.fragment;
                    fragment7.mNextAnim = i6;
                    this.mManager.attachFragment(fragment7, FragmentManagerImpl.reverseTransit(i4), i);
                    break;
                case 7:
                    Fragment fragment8 = op.fragment;
                    fragment8.mNextAnim = i6;
                    this.mManager.detachFragment(fragment8, FragmentManagerImpl.reverseTransit(i4), i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.cmd);
            }
        }
        if (z4) {
            FragmentManagerImpl fragmentManagerImpl = this.mManager;
            fragmentManagerImpl.moveToState(fragmentManagerImpl.mCurState, FragmentManagerImpl.reverseTransit(i4), i, true);
        } else {
            transitionState2 = transitionState;
        }
        int i12 = this.mIndex;
        if (i12 >= 0) {
            this.mManager.freeBackStackIndex(i12);
            this.mIndex = -1;
        }
        return transitionState2;
    }

    @Override // mx_android.support.v4.app.FragmentManager.BackStackEntry
    public String getName() {
        return this.mName;
    }

    public int getTransition() {
        return this.mTransition;
    }

    public int getTransitionStyle() {
        return this.mTransitionStyle;
    }

    @Override // mx_android.support.v4.app.FragmentTransaction
    public boolean isEmpty() {
        return this.mNumOp == 0;
    }

    private TransitionState beginTransition(SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2, boolean z4) {
        TransitionState transitionState = new TransitionState();
        transitionState.nonExistentView = new View(this.mManager.mActivity);
        boolean z5 = false;
        for (int i = 0; i < sparseArray.size(); i++) {
            if (configureTransitions(sparseArray.keyAt(i), transitionState, z4, sparseArray, sparseArray2)) {
                z5 = true;
            }
        }
        for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
            int iKeyAt = sparseArray2.keyAt(i4);
            if (sparseArray.get(iKeyAt) == null && configureTransitions(iKeyAt, transitionState, z4, sparseArray, sparseArray2)) {
                z5 = true;
            }
        }
        if (z5) {
            return transitionState;
        }
        return null;
    }

    private static Object getEnterTransition(Fragment fragment, boolean z4) {
        if (fragment == null) {
            return null;
        }
        return FragmentTransitionCompat21.cloneTransition(z4 ? fragment.getReenterTransition() : fragment.getEnterTransition());
    }

    private static Object getExitTransition(Fragment fragment, boolean z4) {
        if (fragment == null) {
            return null;
        }
        return FragmentTransitionCompat21.cloneTransition(z4 ? fragment.getReturnTransition() : fragment.getExitTransition());
    }

    private static Object getSharedElementTransition(Fragment fragment, Fragment fragment2, boolean z4) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return FragmentTransitionCompat21.cloneTransition(z4 ? fragment2.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition());
    }

    private static Object captureExitingViews(Object obj, Fragment fragment, ArrayList<View> arrayList, ArrayMap<String, View> arrayMap, View view) {
        return obj != null ? FragmentTransitionCompat21.captureExitingViews(obj, fragment.getView(), arrayList, arrayMap, view) : obj;
    }

    private ArrayMap<String, View> remapSharedElements(TransitionState transitionState, Fragment fragment, boolean z4) {
        ArrayMap<String, View> arrayMap = new ArrayMap<>();
        if (this.mSharedElementSourceNames != null) {
            FragmentTransitionCompat21.findNamedViews(arrayMap, fragment.getView());
            if (z4) {
                arrayMap.retainAll(this.mSharedElementTargetNames);
            } else {
                arrayMap = remapNames(this.mSharedElementSourceNames, this.mSharedElementTargetNames, arrayMap);
            }
        }
        if (z4) {
            if (fragment.mEnterTransitionCallback != null) {
                fragment.mEnterTransitionCallback.onMapSharedElements(this.mSharedElementTargetNames, arrayMap);
            }
            setBackNameOverrides(transitionState, arrayMap, false);
        } else {
            if (fragment.mExitTransitionCallback != null) {
                fragment.mExitTransitionCallback.onMapSharedElements(this.mSharedElementTargetNames, arrayMap);
            }
            setNameOverrides(transitionState, arrayMap, false);
        }
        return arrayMap;
    }

    private boolean configureTransitions(int i, TransitionState transitionState, boolean z4, SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2) {
        ArrayList<View> arrayList;
        ArrayList<View> arrayList2;
        FragmentTransitionCompat21.ViewRetriever viewRetriever;
        Object obj;
        Object obj2;
        ViewGroup viewGroup = (ViewGroup) this.mManager.mContainer.findViewById(i);
        if (viewGroup == null) {
            return false;
        }
        final Fragment fragment = sparseArray2.get(i);
        Fragment fragment2 = sparseArray.get(i);
        Object enterTransition = getEnterTransition(fragment, z4);
        Object sharedElementTransition = getSharedElementTransition(fragment, fragment2, z4);
        Object exitTransition = getExitTransition(fragment2, z4);
        if (enterTransition == null && sharedElementTransition == null && exitTransition == null) {
            return false;
        }
        ArrayList<View> arrayList3 = new ArrayList<>();
        ArrayMap<String, View> arrayMap = null;
        if (sharedElementTransition != null) {
            ArrayMap<String, View> arrayMapRemapSharedElements = remapSharedElements(transitionState, fragment2, z4);
            arrayList3.add(transitionState.nonExistentView);
            arrayList3.addAll(arrayMapRemapSharedElements.values());
            SharedElementCallback sharedElementCallback = z4 ? fragment2.mEnterTransitionCallback : fragment.mEnterTransitionCallback;
            if (sharedElementCallback != null) {
                arrayList = arrayList3;
                sharedElementCallback.onSharedElementStart(new ArrayList(arrayMapRemapSharedElements.keySet()), new ArrayList(arrayMapRemapSharedElements.values()), null);
            } else {
                arrayList = arrayList3;
            }
            arrayMap = arrayMapRemapSharedElements;
        } else {
            arrayList = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList();
        Object objCaptureExitingViews = captureExitingViews(exitTransition, fragment2, arrayList4, arrayMap, transitionState.nonExistentView);
        ArrayList<String> arrayList5 = this.mSharedElementTargetNames;
        if (arrayList5 != null && arrayMap != null) {
            View view = arrayMap.get(arrayList5.get(0));
            if (view != null) {
                if (objCaptureExitingViews != null) {
                    FragmentTransitionCompat21.setEpicenter(objCaptureExitingViews, view);
                }
                if (sharedElementTransition != null) {
                    FragmentTransitionCompat21.setEpicenter(sharedElementTransition, view);
                }
            }
        }
        FragmentTransitionCompat21.ViewRetriever viewRetriever2 = new FragmentTransitionCompat21.ViewRetriever() { // from class: mx_android.support.v4.app.BackStackRecord.1
            @Override // mx_android.support.v4.app.FragmentTransitionCompat21.ViewRetriever
            public View getView() {
                return fragment.getView();
            }
        };
        if (sharedElementTransition != null) {
            viewRetriever = viewRetriever2;
            arrayList2 = arrayList;
            obj = objCaptureExitingViews;
            obj2 = sharedElementTransition;
            prepareSharedElementTransition(transitionState, viewGroup, sharedElementTransition, fragment, fragment2, z4, arrayList2);
        } else {
            arrayList2 = arrayList;
            viewRetriever = viewRetriever2;
            obj = objCaptureExitingViews;
            obj2 = sharedElementTransition;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayMap arrayMap2 = new ArrayMap();
        Object objMergeTransitions = FragmentTransitionCompat21.mergeTransitions(enterTransition, obj, obj2, z4 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap());
        if (objMergeTransitions != null) {
            FragmentTransitionCompat21.addTransitionTargets(enterTransition, obj2, viewGroup, viewRetriever, transitionState.nonExistentView, transitionState.enteringEpicenterView, transitionState.nameOverrides, arrayList6, arrayMap2, arrayList2);
            excludeHiddenFragmentsAfterEnter(viewGroup, transitionState, i, objMergeTransitions);
            FragmentTransitionCompat21.excludeTarget(objMergeTransitions, transitionState.nonExistentView, true);
            excludeHiddenFragments(transitionState, i, objMergeTransitions);
            FragmentTransitionCompat21.beginDelayedTransition(viewGroup, objMergeTransitions);
            FragmentTransitionCompat21.cleanupTransitions(viewGroup, transitionState.nonExistentView, enterTransition, arrayList6, obj, arrayList4, obj2, arrayList2, objMergeTransitions, transitionState.hiddenFragmentViews, arrayMap2);
        }
        return objMergeTransitions != null;
    }

    private void prepareSharedElementTransition(final TransitionState transitionState, final View view, final Object obj, final Fragment fragment, final Fragment fragment2, final boolean z4, final ArrayList<View> arrayList) {
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: mx_android.support.v4.app.BackStackRecord.2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                Object obj2 = obj;
                if (obj2 == null) {
                    return true;
                }
                FragmentTransitionCompat21.removeTargets(obj2, arrayList);
                arrayList.clear();
                ArrayMap arrayMapMapSharedElementsIn = BackStackRecord.this.mapSharedElementsIn(transitionState, z4, fragment);
                arrayList.add(transitionState.nonExistentView);
                arrayList.addAll(arrayMapMapSharedElementsIn.values());
                FragmentTransitionCompat21.addTargets(obj, arrayList);
                BackStackRecord.this.setEpicenterIn(arrayMapMapSharedElementsIn, transitionState);
                BackStackRecord.this.callSharedElementEnd(transitionState, fragment, fragment2, z4, arrayMapMapSharedElementsIn);
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callSharedElementEnd(TransitionState transitionState, Fragment fragment, Fragment fragment2, boolean z4, ArrayMap<String, View> arrayMap) {
        SharedElementCallback sharedElementCallback = z4 ? fragment2.mEnterTransitionCallback : fragment.mEnterTransitionCallback;
        if (sharedElementCallback != null) {
            sharedElementCallback.onSharedElementEnd(new ArrayList(arrayMap.keySet()), new ArrayList(arrayMap.values()), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEpicenterIn(ArrayMap<String, View> arrayMap, TransitionState transitionState) {
        View view;
        if (this.mSharedElementTargetNames == null || arrayMap.isEmpty() || (view = arrayMap.get(this.mSharedElementTargetNames.get(0))) == null) {
            return;
        }
        transitionState.enteringEpicenterView.epicenter = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayMap<String, View> mapSharedElementsIn(TransitionState transitionState, boolean z4, Fragment fragment) {
        ArrayMap<String, View> arrayMapMapEnteringSharedElements = mapEnteringSharedElements(transitionState, fragment, z4);
        if (z4) {
            if (fragment.mExitTransitionCallback != null) {
                fragment.mExitTransitionCallback.onMapSharedElements(this.mSharedElementTargetNames, arrayMapMapEnteringSharedElements);
            }
            setBackNameOverrides(transitionState, arrayMapMapEnteringSharedElements, true);
        } else {
            if (fragment.mEnterTransitionCallback != null) {
                fragment.mEnterTransitionCallback.onMapSharedElements(this.mSharedElementTargetNames, arrayMapMapEnteringSharedElements);
            }
            setNameOverrides(transitionState, arrayMapMapEnteringSharedElements, true);
        }
        return arrayMapMapEnteringSharedElements;
    }

    private static ArrayMap<String, View> remapNames(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayMap<String, View> arrayMap) {
        if (arrayMap.isEmpty()) {
            return arrayMap;
        }
        ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayMap.get(arrayList.get(i));
            if (view != null) {
                arrayMap2.put(arrayList2.get(i), view);
            }
        }
        return arrayMap2;
    }

    private ArrayMap<String, View> mapEnteringSharedElements(TransitionState transitionState, Fragment fragment, boolean z4) {
        ArrayMap<String, View> arrayMap = new ArrayMap<>();
        View view = fragment.getView();
        if (view == null || this.mSharedElementSourceNames == null) {
            return arrayMap;
        }
        FragmentTransitionCompat21.findNamedViews(arrayMap, view);
        if (z4) {
            return remapNames(this.mSharedElementSourceNames, this.mSharedElementTargetNames, arrayMap);
        }
        arrayMap.retainAll(this.mSharedElementTargetNames);
        return arrayMap;
    }

    private void excludeHiddenFragmentsAfterEnter(final View view, final TransitionState transitionState, final int i, final Object obj) {
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: mx_android.support.v4.app.BackStackRecord.3
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                BackStackRecord.this.excludeHiddenFragments(transitionState, i, obj);
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void excludeHiddenFragments(TransitionState transitionState, int i, Object obj) {
        if (this.mManager.mAdded != null) {
            for (int i4 = 0; i4 < this.mManager.mAdded.size(); i4++) {
                Fragment fragment = this.mManager.mAdded.get(i4);
                if (fragment.mView != null && fragment.mContainer != null && fragment.mContainerId == i) {
                    if (fragment.mHidden) {
                        if (!transitionState.hiddenFragmentViews.contains(fragment.mView)) {
                            FragmentTransitionCompat21.excludeTarget(obj, fragment.mView, true);
                            transitionState.hiddenFragmentViews.add(fragment.mView);
                        }
                    } else {
                        FragmentTransitionCompat21.excludeTarget(obj, fragment.mView, false);
                        transitionState.hiddenFragmentViews.remove(fragment.mView);
                    }
                }
            }
        }
    }

    private static void setNameOverride(ArrayMap<String, String> arrayMap, String str, String str2) {
        if (str == null || str2 == null || str.equals(str2)) {
            return;
        }
        for (int i = 0; i < arrayMap.size(); i++) {
            if (str.equals(arrayMap.valueAt(i))) {
                arrayMap.setValueAt(i, str2);
                return;
            }
        }
        arrayMap.put(str, str2);
    }

    private static void setNameOverrides(TransitionState transitionState, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                setNameOverride(transitionState.nameOverrides, arrayList.get(i), arrayList2.get(i));
            }
        }
    }

    private void setBackNameOverrides(TransitionState transitionState, ArrayMap<String, View> arrayMap, boolean z4) {
        ArrayList<String> arrayList = this.mSharedElementTargetNames;
        int size = arrayList == null ? 0 : arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = this.mSharedElementSourceNames.get(i);
            View view = arrayMap.get(this.mSharedElementTargetNames.get(i));
            if (view != null) {
                String transitionName = FragmentTransitionCompat21.getTransitionName(view);
                if (z4) {
                    setNameOverride(transitionState.nameOverrides, str, transitionName);
                } else {
                    setNameOverride(transitionState.nameOverrides, transitionName, str);
                }
            }
        }
    }

    private void setNameOverrides(TransitionState transitionState, ArrayMap<String, View> arrayMap, boolean z4) {
        int size = arrayMap.size();
        for (int i = 0; i < size; i++) {
            String strKeyAt = arrayMap.keyAt(i);
            String transitionName = FragmentTransitionCompat21.getTransitionName(arrayMap.valueAt(i));
            if (z4) {
                setNameOverride(transitionState.nameOverrides, strKeyAt, transitionName);
            } else {
                setNameOverride(transitionState.nameOverrides, transitionName, strKeyAt);
            }
        }
    }

    public class TransitionState {
        public View nonExistentView;
        public ArrayMap<String, String> nameOverrides = new ArrayMap<>();
        public ArrayList<View> hiddenFragmentViews = new ArrayList<>();
        public FragmentTransitionCompat21.EpicenterView enteringEpicenterView = new FragmentTransitionCompat21.EpicenterView();

        public TransitionState() {
        }
    }
}
