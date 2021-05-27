package org.lgdv.math;

import org.lgdv.JSON;

public class Geometry implements JSON.Stringable {
    public final Vec3D origin;

    public Geometry(final Vec3D origin) {
        this.origin = origin;
    }

    /**
     * The origin point of the Ray
     * 
     * @return The point of origin (where was the ray emitted from)
     */
    public final Vec3D getOrigin() {
        return origin;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "@" + origin;
    }

    public String toJSON(){
        return "{\"origin\":"+origin.toJSON()+"}";
    }
}