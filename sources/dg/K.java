package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.internal.Internal;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.ExtractionDetails;
import dde.protobuf.fragments.File;
import dde.protobuf.fragments.MediaCount;
import dde.protobuf.fragments.MediaFragment;
import defpackage.AbstractC1414e;
import java.io.IOException;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class K extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        ArrayList arrayListJ = AbstractC1414e.j(protoReader, numX49.tnTj78("bd5bD"));
        long jBeginMessage = protoReader.beginMessage();
        ExtractionDetails extractionDetailsDecode = null;
        MediaCount mediaCountDecode = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new MediaFragment(extractionDetailsDecode, mediaCountDecode, arrayListJ, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                extractionDetailsDecode = ExtractionDetails.ADAPTER.decode(protoReader);
            } else if (iNextTag == 2) {
                mediaCountDecode = MediaCount.ADAPTER.decode(protoReader);
            } else if (iNextTag != 3) {
                protoReader.readUnknownField(iNextTag);
            } else {
                arrayListJ.add(File.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        MediaFragment mediaFragment = (MediaFragment) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5bh"));
        kotlin.jvm.internal.j.g(mediaFragment, numX49.tnTj78("bd5bM"));
        if (mediaFragment.getExtractionDetails() != null) {
            ExtractionDetails.ADAPTER.encodeWithTag(protoWriter, 1, mediaFragment.getExtractionDetails());
        }
        MediaCount.ADAPTER.encodeWithTag(protoWriter, 2, mediaFragment.getMediaCount());
        File.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, mediaFragment.getFiles());
        protoWriter.writeBytes(mediaFragment.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MediaFragment mediaFragment = (MediaFragment) obj;
        kotlin.jvm.internal.j.g(mediaFragment, numX49.tnTj78("bd5ba"));
        int size = mediaFragment.unknownFields().size();
        if (mediaFragment.getExtractionDetails() != null) {
            size += ExtractionDetails.ADAPTER.encodedSizeWithTag(1, mediaFragment.getExtractionDetails());
        }
        return File.ADAPTER.asRepeated().encodedSizeWithTag(3, mediaFragment.getFiles()) + MediaCount.ADAPTER.encodedSizeWithTag(2, mediaFragment.getMediaCount()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MediaFragment mediaFragment = (MediaFragment) obj;
        kotlin.jvm.internal.j.g(mediaFragment, numX49.tnTj78("bd5bX"));
        ExtractionDetails extractionDetails = mediaFragment.getExtractionDetails();
        ExtractionDetails extractionDetailsRedact = extractionDetails != null ? ExtractionDetails.ADAPTER.redact(extractionDetails) : null;
        MediaCount mediaCount = mediaFragment.getMediaCount();
        return mediaFragment.copy(extractionDetailsRedact, mediaCount != null ? MediaCount.ADAPTER.redact(mediaCount) : null, Internal.m186redactElements(mediaFragment.getFiles(), File.ADAPTER), ByteString.EMPTY);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        MediaFragment mediaFragment = (MediaFragment) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5bN"));
        kotlin.jvm.internal.j.g(mediaFragment, numX49.tnTj78("bd5b6"));
        reverseProtoWriter.writeBytes(mediaFragment.unknownFields());
        File.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, mediaFragment.getFiles());
        MediaCount.ADAPTER.encodeWithTag(reverseProtoWriter, 2, mediaFragment.getMediaCount());
        if (mediaFragment.getExtractionDetails() != null) {
            ExtractionDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 1, mediaFragment.getExtractionDetails());
        }
    }
}
