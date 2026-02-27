package mx_android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import mx_android.support.v4.app.BackStackRecord;

/* JADX INFO: compiled from: BackStackRecord.java */
/* JADX INFO: loaded from: classes7.dex */
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator<BackStackState>() { // from class: mx_android.support.v4.app.BackStackState.1
        @Override // android.os.Parcelable.Creator
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    };
    final int mBreadCrumbShortTitleRes;
    final CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final CharSequence mBreadCrumbTitleText;
    final int mIndex;
    final String mName;
    final int[] mOps;
    final ArrayList<String> mSharedElementSourceNames;
    final ArrayList<String> mSharedElementTargetNames;
    final int mTransition;
    final int mTransitionStyle;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BackStackState(FragmentManagerImpl fragmentManagerImpl, BackStackRecord backStackRecord) {
        int size = 0;
        for (BackStackRecord.Op op = backStackRecord.mHead; op != null; op = op.next) {
            if (op.removed != null) {
                size += op.removed.size();
            }
        }
        this.mOps = new int[(backStackRecord.mNumOp * 7) + size];
        if (!backStackRecord.mAddToBackStack) {
            throw new IllegalStateException("Not on back stack");
        }
        int i = 0;
        for (BackStackRecord.Op op2 = backStackRecord.mHead; op2 != null; op2 = op2.next) {
            int i4 = i + 1;
            this.mOps[i] = op2.cmd;
            int i6 = i4 + 1;
            this.mOps[i4] = op2.fragment != null ? op2.fragment.mIndex : -1;
            int i10 = i6 + 1;
            this.mOps[i6] = op2.enterAnim;
            int i11 = i10 + 1;
            this.mOps[i10] = op2.exitAnim;
            int i12 = i11 + 1;
            this.mOps[i11] = op2.popEnterAnim;
            int i13 = i12 + 1;
            this.mOps[i12] = op2.popExitAnim;
            if (op2.removed != null) {
                int size2 = op2.removed.size();
                int i14 = i13 + 1;
                this.mOps[i13] = size2;
                int i15 = 0;
                while (i15 < size2) {
                    this.mOps[i14] = op2.removed.get(i15).mIndex;
                    i15++;
                    i14++;
                }
                i = i14;
            } else {
                this.mOps[i13] = 0;
                i = i13 + 1;
            }
        }
        this.mTransition = backStackRecord.mTransition;
        this.mTransitionStyle = backStackRecord.mTransitionStyle;
        this.mName = backStackRecord.mName;
        this.mIndex = backStackRecord.mIndex;
        this.mBreadCrumbTitleRes = backStackRecord.mBreadCrumbTitleRes;
        this.mBreadCrumbTitleText = backStackRecord.mBreadCrumbTitleText;
        this.mBreadCrumbShortTitleRes = backStackRecord.mBreadCrumbShortTitleRes;
        this.mBreadCrumbShortTitleText = backStackRecord.mBreadCrumbShortTitleText;
        this.mSharedElementSourceNames = backStackRecord.mSharedElementSourceNames;
        this.mSharedElementTargetNames = backStackRecord.mSharedElementTargetNames;
    }

    public BackStackState(Parcel parcel) {
        this.mOps = parcel.createIntArray();
        this.mTransition = parcel.readInt();
        this.mTransitionStyle = parcel.readInt();
        this.mName = parcel.readString();
        this.mIndex = parcel.readInt();
        this.mBreadCrumbTitleRes = parcel.readInt();
        this.mBreadCrumbTitleText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mBreadCrumbShortTitleRes = parcel.readInt();
        this.mBreadCrumbShortTitleText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mSharedElementSourceNames = parcel.createStringArrayList();
        this.mSharedElementTargetNames = parcel.createStringArrayList();
    }

    public BackStackRecord instantiate(FragmentManagerImpl fragmentManagerImpl) {
        BackStackRecord backStackRecord = new BackStackRecord(fragmentManagerImpl);
        int i = 0;
        int i4 = 0;
        while (i < this.mOps.length) {
            BackStackRecord.Op op = new BackStackRecord.Op();
            int i6 = i + 1;
            op.cmd = this.mOps[i];
            if (FragmentManagerImpl.DEBUG) {
                Log.v(androidx.fragment.app.FragmentManager.TAG, "Instantiate " + backStackRecord + " op #" + i4 + " base fragment #" + this.mOps[i6]);
            }
            int i10 = i6 + 1;
            int i11 = this.mOps[i6];
            if (i11 >= 0) {
                op.fragment = fragmentManagerImpl.mActive.get(i11);
            } else {
                op.fragment = null;
            }
            int i12 = i10 + 1;
            op.enterAnim = this.mOps[i10];
            int i13 = i12 + 1;
            op.exitAnim = this.mOps[i12];
            int i14 = i13 + 1;
            op.popEnterAnim = this.mOps[i13];
            int i15 = i14 + 1;
            op.popExitAnim = this.mOps[i14];
            int i16 = i15 + 1;
            int i17 = this.mOps[i15];
            if (i17 > 0) {
                op.removed = new ArrayList<>(i17);
                int i18 = 0;
                while (i18 < i17) {
                    if (FragmentManagerImpl.DEBUG) {
                        Log.v(androidx.fragment.app.FragmentManager.TAG, "Instantiate " + backStackRecord + " set remove fragment #" + this.mOps[i16]);
                    }
                    op.removed.add(fragmentManagerImpl.mActive.get(this.mOps[i16]));
                    i18++;
                    i16++;
                }
            }
            i = i16;
            backStackRecord.addOp(op);
            i4++;
        }
        backStackRecord.mTransition = this.mTransition;
        backStackRecord.mTransitionStyle = this.mTransitionStyle;
        backStackRecord.mName = this.mName;
        backStackRecord.mIndex = this.mIndex;
        backStackRecord.mAddToBackStack = true;
        backStackRecord.mBreadCrumbTitleRes = this.mBreadCrumbTitleRes;
        backStackRecord.mBreadCrumbTitleText = this.mBreadCrumbTitleText;
        backStackRecord.mBreadCrumbShortTitleRes = this.mBreadCrumbShortTitleRes;
        backStackRecord.mBreadCrumbShortTitleText = this.mBreadCrumbShortTitleText;
        backStackRecord.mSharedElementSourceNames = this.mSharedElementSourceNames;
        backStackRecord.mSharedElementTargetNames = this.mSharedElementTargetNames;
        backStackRecord.bumpBackStackNesting(1);
        return backStackRecord;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.mOps);
        parcel.writeInt(this.mTransition);
        parcel.writeInt(this.mTransitionStyle);
        parcel.writeString(this.mName);
        parcel.writeInt(this.mIndex);
        parcel.writeInt(this.mBreadCrumbTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbTitleText, parcel, 0);
        parcel.writeInt(this.mBreadCrumbShortTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbShortTitleText, parcel, 0);
        parcel.writeStringList(this.mSharedElementSourceNames);
        parcel.writeStringList(this.mSharedElementTargetNames);
    }
}
