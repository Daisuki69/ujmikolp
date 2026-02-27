package androidx.recyclerview.widget;

import androidx.recyclerview.widget.AdapterHelper;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class OpReorderer {
    final Callback mCallback;

    public interface Callback {
        AdapterHelper.UpdateOp obtainUpdateOp(int i, int i4, int i6, Object obj);

        void recycleUpdateOp(AdapterHelper.UpdateOp updateOp);
    }

    public OpReorderer(Callback callback) {
        this.mCallback = callback;
    }

    private int getLastMoveOutOfOrder(List<AdapterHelper.UpdateOp> list) {
        boolean z4 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).cmd != 8) {
                z4 = true;
            } else if (z4) {
                return size;
            }
        }
        return -1;
    }

    private void swapMoveAdd(List<AdapterHelper.UpdateOp> list, int i, AdapterHelper.UpdateOp updateOp, int i4, AdapterHelper.UpdateOp updateOp2) {
        int i6 = updateOp.itemCount;
        int i10 = updateOp2.positionStart;
        int i11 = i6 < i10 ? -1 : 0;
        int i12 = updateOp.positionStart;
        if (i12 < i10) {
            i11++;
        }
        if (i10 <= i12) {
            updateOp.positionStart = i12 + updateOp2.itemCount;
        }
        int i13 = updateOp2.positionStart;
        if (i13 <= i6) {
            updateOp.itemCount = i6 + updateOp2.itemCount;
        }
        updateOp2.positionStart = i13 + i11;
        list.set(i, updateOp2);
        list.set(i4, updateOp);
    }

    private void swapMoveOp(List<AdapterHelper.UpdateOp> list, int i, int i4) {
        AdapterHelper.UpdateOp updateOp = list.get(i);
        AdapterHelper.UpdateOp updateOp2 = list.get(i4);
        int i6 = updateOp2.cmd;
        if (i6 == 1) {
            swapMoveAdd(list, i, updateOp, i4, updateOp2);
        } else if (i6 == 2) {
            swapMoveRemove(list, i, updateOp, i4, updateOp2);
        } else {
            if (i6 != 4) {
                return;
            }
            swapMoveUpdate(list, i, updateOp, i4, updateOp2);
        }
    }

    public void reorderOps(List<AdapterHelper.UpdateOp> list) {
        while (true) {
            int lastMoveOutOfOrder = getLastMoveOutOfOrder(list);
            if (lastMoveOutOfOrder == -1) {
                return;
            } else {
                swapMoveOp(list, lastMoveOutOfOrder, lastMoveOutOfOrder + 1);
            }
        }
    }

    public void swapMoveRemove(List<AdapterHelper.UpdateOp> list, int i, AdapterHelper.UpdateOp updateOp, int i4, AdapterHelper.UpdateOp updateOp2) {
        boolean z4;
        int i6 = updateOp.positionStart;
        int i10 = updateOp.itemCount;
        boolean z5 = false;
        if (i6 < i10) {
            if (updateOp2.positionStart == i6 && updateOp2.itemCount == i10 - i6) {
                z4 = false;
                z5 = true;
            } else {
                z4 = false;
            }
        } else if (updateOp2.positionStart == i10 + 1 && updateOp2.itemCount == i6 - i10) {
            z4 = true;
            z5 = true;
        } else {
            z4 = true;
        }
        int i11 = updateOp2.positionStart;
        if (i10 < i11) {
            updateOp2.positionStart = i11 - 1;
        } else {
            int i12 = updateOp2.itemCount;
            if (i10 < i11 + i12) {
                updateOp2.itemCount = i12 - 1;
                updateOp.cmd = 2;
                updateOp.itemCount = 1;
                if (updateOp2.itemCount == 0) {
                    list.remove(i4);
                    this.mCallback.recycleUpdateOp(updateOp2);
                    return;
                }
                return;
            }
        }
        int i13 = updateOp.positionStart;
        int i14 = updateOp2.positionStart;
        AdapterHelper.UpdateOp updateOpObtainUpdateOp = null;
        if (i13 <= i14) {
            updateOp2.positionStart = i14 + 1;
        } else {
            int i15 = updateOp2.itemCount;
            if (i13 < i14 + i15) {
                updateOpObtainUpdateOp = this.mCallback.obtainUpdateOp(2, i13 + 1, (i14 + i15) - i13, null);
                updateOp2.itemCount = updateOp.positionStart - updateOp2.positionStart;
            }
        }
        if (z5) {
            list.set(i, updateOp2);
            list.remove(i4);
            this.mCallback.recycleUpdateOp(updateOp);
            return;
        }
        if (z4) {
            if (updateOpObtainUpdateOp != null) {
                int i16 = updateOp.positionStart;
                if (i16 > updateOpObtainUpdateOp.positionStart) {
                    updateOp.positionStart = i16 - updateOpObtainUpdateOp.itemCount;
                }
                int i17 = updateOp.itemCount;
                if (i17 > updateOpObtainUpdateOp.positionStart) {
                    updateOp.itemCount = i17 - updateOpObtainUpdateOp.itemCount;
                }
            }
            int i18 = updateOp.positionStart;
            if (i18 > updateOp2.positionStart) {
                updateOp.positionStart = i18 - updateOp2.itemCount;
            }
            int i19 = updateOp.itemCount;
            if (i19 > updateOp2.positionStart) {
                updateOp.itemCount = i19 - updateOp2.itemCount;
            }
        } else {
            if (updateOpObtainUpdateOp != null) {
                int i20 = updateOp.positionStart;
                if (i20 >= updateOpObtainUpdateOp.positionStart) {
                    updateOp.positionStart = i20 - updateOpObtainUpdateOp.itemCount;
                }
                int i21 = updateOp.itemCount;
                if (i21 >= updateOpObtainUpdateOp.positionStart) {
                    updateOp.itemCount = i21 - updateOpObtainUpdateOp.itemCount;
                }
            }
            int i22 = updateOp.positionStart;
            if (i22 >= updateOp2.positionStart) {
                updateOp.positionStart = i22 - updateOp2.itemCount;
            }
            int i23 = updateOp.itemCount;
            if (i23 >= updateOp2.positionStart) {
                updateOp.itemCount = i23 - updateOp2.itemCount;
            }
        }
        list.set(i, updateOp2);
        if (updateOp.positionStart != updateOp.itemCount) {
            list.set(i4, updateOp);
        } else {
            list.remove(i4);
        }
        if (updateOpObtainUpdateOp != null) {
            list.add(i, updateOpObtainUpdateOp);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void swapMoveUpdate(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> r9, int r10, androidx.recyclerview.widget.AdapterHelper.UpdateOp r11, int r12, androidx.recyclerview.widget.AdapterHelper.UpdateOp r13) {
        /*
            r8 = this;
            int r0 = r11.itemCount
            int r1 = r13.positionStart
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r13.positionStart = r1
            goto L20
        Ld:
            int r5 = r13.itemCount
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r13.itemCount = r5
            androidx.recyclerview.widget.OpReorderer$Callback r0 = r8.mCallback
            int r1 = r11.positionStart
            java.lang.Object r5 = r13.payload
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r0 = r0.obtainUpdateOp(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r11.positionStart
            int r5 = r13.positionStart
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r13.positionStart = r5
            goto L41
        L2b:
            int r6 = r13.itemCount
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.OpReorderer$Callback r4 = r8.mCallback
            int r1 = r1 + r3
            java.lang.Object r3 = r13.payload
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r4 = r4.obtainUpdateOp(r2, r1, r5, r3)
            int r1 = r13.itemCount
            int r1 = r1 - r5
            r13.itemCount = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.itemCount
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.OpReorderer$Callback r11 = r8.mCallback
            r11.recycleUpdateOp(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r4 == 0) goto L5e
            r9.add(r10, r4)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.OpReorderer.swapMoveUpdate(java.util.List, int, androidx.recyclerview.widget.AdapterHelper$UpdateOp, int, androidx.recyclerview.widget.AdapterHelper$UpdateOp):void");
    }
}
