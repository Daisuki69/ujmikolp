package io.split.android.client.dtos;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface SegmentResponse {
    @NonNull
    List<String> getSegments();

    long getTill();
}
