package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.ExtractionDetails;
import dde.protobuf.fragments.GPS;
import dde.protobuf.fragments.LocationFragment;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: renamed from: dg.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1373G extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        kotlin.jvm.internal.j.g(protoReader, numX49.tnTj78("bd5PY"));
        long jBeginMessage = protoReader.beginMessage();
        ExtractionDetails extractionDetailsDecode = null;
        GPS gpsDecode = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new LocationFragment(extractionDetailsDecode, gpsDecode, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                extractionDetailsDecode = ExtractionDetails.ADAPTER.decode(protoReader);
            } else if (iNextTag != 2) {
                protoReader.readUnknownField(iNextTag);
            } else {
                gpsDecode = GPS.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        LocationFragment locationFragment = (LocationFragment) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5PT"));
        kotlin.jvm.internal.j.g(locationFragment, numX49.tnTj78("bd5PR"));
        if (locationFragment.getExtractionDetails() != null) {
            ExtractionDetails.ADAPTER.encodeWithTag(protoWriter, 1, locationFragment.getExtractionDetails());
        }
        GPS.ADAPTER.encodeWithTag(protoWriter, 2, locationFragment.getGps());
        protoWriter.writeBytes(locationFragment.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocationFragment locationFragment = (LocationFragment) obj;
        kotlin.jvm.internal.j.g(locationFragment, numX49.tnTj78("bd5Pg"));
        int size = locationFragment.unknownFields().size();
        if (locationFragment.getExtractionDetails() != null) {
            size += ExtractionDetails.ADAPTER.encodedSizeWithTag(1, locationFragment.getExtractionDetails());
        }
        return GPS.ADAPTER.encodedSizeWithTag(2, locationFragment.getGps()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocationFragment locationFragment = (LocationFragment) obj;
        kotlin.jvm.internal.j.g(locationFragment, numX49.tnTj78("bd5Pf"));
        ExtractionDetails extractionDetails = locationFragment.getExtractionDetails();
        ExtractionDetails extractionDetailsRedact = extractionDetails != null ? ExtractionDetails.ADAPTER.redact(extractionDetails) : null;
        GPS gps = locationFragment.getGps();
        return locationFragment.copy(extractionDetailsRedact, gps != null ? GPS.ADAPTER.redact(gps) : null, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        LocationFragment locationFragment = (LocationFragment) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5Pp"));
        kotlin.jvm.internal.j.g(locationFragment, numX49.tnTj78("bd5P0"));
        reverseProtoWriter.writeBytes(locationFragment.unknownFields());
        GPS.ADAPTER.encodeWithTag(reverseProtoWriter, 2, locationFragment.getGps());
        if (locationFragment.getExtractionDetails() != null) {
            ExtractionDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 1, locationFragment.getExtractionDetails());
        }
    }
}
