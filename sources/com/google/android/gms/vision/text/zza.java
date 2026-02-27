package com.google.android.gms.vision.text;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zza implements Comparator<Map.Entry<String, Integer>> {
    public zza(TextBlock textBlock) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
        return entry.getValue().compareTo(entry2.getValue());
    }
}
