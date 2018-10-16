/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.File;

/**
 *
 * @author dam2a10
 */
public class MyBufferedImage extends BufferedImage {
    
    private byte[] raster;
    private Viewer canvas;
    private Raster imgRaster;
    public MyBufferedImage(BufferedImage image) {
        super(image.getWidth(), image.getHeight(), image.getType());
    }
}
    