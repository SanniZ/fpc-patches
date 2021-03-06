/**
 * Copyright (c) 2017 Fingerprint Cards AB <tech@fingerprints.com>
 * All rights are reserved.
 * Proprietary and confidential.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Any use is subject to an appropriate license granted by Fingerprint Cards AB.
 */
package com.fingerprints.extension.sensetouch;

public interface CalibrationCallback {
    public abstract void onUpdate(final float value, final long remainingTime);

    public abstract void onDone();
}