package com.tbruyelle.rxpermissions2;

import Wh.b;
import Ze.a;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class RxPermissionsFragment extends Fragment {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final HashMap f15520B = new HashMap();

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 42) {
            return;
        }
        boolean[] zArr = new boolean[strArr.length];
        for (int i4 = 0; i4 < strArr.length; i4++) {
            zArr[i4] = shouldShowRequestPermissionRationale(strArr[i4]);
        }
        int length = strArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            String str = strArr[i6];
            HashMap map = this.f15520B;
            b bVar = (b) map.get(str);
            if (bVar == null) {
                Log.e("c", "RxPermissions.onRequestPermissionsResult invoked but didn't find the corresponding permission request.");
                return;
            }
            map.remove(strArr[i6]);
            bVar.onNext(new a(strArr[i6], iArr[i6] == 0, zArr[i6]));
            bVar.onComplete();
        }
    }
}
