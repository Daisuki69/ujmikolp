package com.paymaya.common.utility;

import androidx.media3.common.PlaybackException;
import com.paymaya.domain.model.MfaTencentErrorResult;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f11220a = cj.M.h(new Pair(210, "HY_NETWORK_ERROR"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_LOCAL_REF_FAILED), "HY_LOCAL_REF_FAILED_ERROR"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_USER_STOPS), "HY_USER_CANCEL_ERROR"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_INNER_ERROR_CODE), "HY_INNER_ERROR_CODE"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_APP_SWITCH), "HY_DO_NOT_CHANGE_ERROR"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_CAMERA_PERMISSION), "HY_OPEN_CAMERA_ERROR"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_INIT_SDK), "HY_INIT_SDK_ERROR"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_FACE_DETECTION_TIMED_OUT), "HY_VERIFY_LOCAL_ERROR"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_PERMISSION_CHECK), "HY_PERMISSION_CHECK_ERROR"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_APP_STOP), "HY_APP_STOP_ERROR"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_LIVE_DATA), "HY_CHECK_LIVE_DATA_ERROR"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_LOCAL_TIME_OUT), "HY_VERIFY_LOCAL_TIME_OUT"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_PREPARE_TIME_OUT), "HY_PREPARE_TIME_OUT"), new Pair(224, "HY_CHECK_PERMISSION_ERROR"), new Pair(288, "HY_ILLEGAL_TOKEN"), new Pair(1001, "System error"), new Pair(1004, "Liveness detection and face comparison failed"), new Pair(Integer.valueOf(PlaybackException.ERROR_CODE_IO_BAD_HTTP_STATUS), "The image passed in is too large or too small"), new Pair(2012, "Several faces were detected"), new Pair(2013, "No face was detected, or the face detected was incomplete"), new Pair(2014, "The image resolution is too low or the quality does not meet the requirements"), new Pair(2015, "Face comparison failed"), new Pair(2016, "The similarity did not reach the standard passing threshold"), new Pair(-999, "The verification The process wasn't finished"));
}
