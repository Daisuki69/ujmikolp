package dde.protobuf.fragments;

import cj.C1110A;
import cj.C1112C;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.AbstractC1414e;
import dg.K;
import dg.L;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaFragment extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "dde.protobuf.fragments.ExtractionDetails#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ExtractionDetails extractionDetails;

    @WireField(adapter = "dde.protobuf.fragments.File#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<File> files;

    @WireField(adapter = "dde.protobuf.fragments.MediaCount#ADAPTER", schemaIndex = 1, tag = 2)
    private final MediaCount mediaCount;
    public static final L Companion = new L();
    public static final ProtoAdapter<MediaFragment> ADAPTER = new K(FieldEncoding.LENGTH_DELIMITED, z.a(MediaFragment.class), "type.googleapis.com/dde.protobuf.fragments.MediaFragment", Syntax.PROTO_3, null, "dde-protobuf/fragments/MediaFragment.proto");

    public MediaFragment() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MediaFragment copy$default(MediaFragment mediaFragment, ExtractionDetails extractionDetails, MediaCount mediaCount, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            extractionDetails = mediaFragment.extractionDetails;
        }
        if ((i & 2) != 0) {
            mediaCount = mediaFragment.mediaCount;
        }
        if ((i & 4) != 0) {
            list = mediaFragment.files;
        }
        if ((i & 8) != 0) {
            byteString = mediaFragment.unknownFields();
        }
        return mediaFragment.copy(extractionDetails, mediaCount, list, byteString);
    }

    public final MediaFragment copy(ExtractionDetails extractionDetails, MediaCount mediaCount, List<File> files, ByteString unknownFields) {
        j.g(files, "files");
        j.g(unknownFields, "unknownFields");
        return new MediaFragment(extractionDetails, mediaCount, files, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaFragment)) {
            return false;
        }
        MediaFragment mediaFragment = (MediaFragment) obj;
        return j.b(unknownFields(), mediaFragment.unknownFields()) && j.b(this.extractionDetails, mediaFragment.extractionDetails) && j.b(this.mediaCount, mediaFragment.mediaCount) && j.b(this.files, mediaFragment.files);
    }

    public final ExtractionDetails getExtractionDetails() {
        return this.extractionDetails;
    }

    public final List<File> getFiles() {
        return this.files;
    }

    public final MediaCount getMediaCount() {
        return this.mediaCount;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ExtractionDetails extractionDetails = this.extractionDetails;
        int iHashCode2 = (iHashCode + (extractionDetails != null ? extractionDetails.hashCode() : 0)) * 37;
        MediaCount mediaCount = this.mediaCount;
        int iHashCode3 = this.files.hashCode() + ((iHashCode2 + (mediaCount != null ? mediaCount.hashCode() : 0)) * 37);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m244newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.extractionDetails != null) {
            arrayList.add("extractionDetails=" + this.extractionDetails);
        }
        if (this.mediaCount != null) {
            arrayList.add("mediaCount=" + this.mediaCount);
        }
        if (!this.files.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("files="), this.files, arrayList);
        }
        return C1110A.F(arrayList, ", ", "MediaFragment{", "}", null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaFragment(ExtractionDetails extractionDetails, MediaCount mediaCount, List<File> files, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(files, "files");
        j.g(unknownFields, "unknownFields");
        this.extractionDetails = extractionDetails;
        this.mediaCount = mediaCount;
        this.files = Internal.immutableCopyOf("files", files);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m244newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public MediaFragment(ExtractionDetails extractionDetails, MediaCount mediaCount, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : extractionDetails, (i & 2) != 0 ? null : mediaCount, (i & 4) != 0 ? C1112C.f9377a : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }
}
