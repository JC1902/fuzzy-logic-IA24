/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectologicadifusa;

/**
 *
 * @author RzSad
 */
public class FuncionesMembresia {
    public static double membershipBool(double datDuro, double x0) {
        if (datDuro <= x0) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    public static double membershipBoolInv(double datDuro, double x0) {
        if (datDuro <= x0) {
            return 0.0;
        } else {
            return 1.0;
        }
    }

    public static double membershipGrade(double datDuro, double x0, double x1, double pendiente) {
        if (datDuro <= x0) {
            return 0.0;
        } else if (datDuro > x0 && datDuro <= x1) {
            return pendiente; // Fórmula pendiente
        } else {
            return 1.0;
        }
    }

    public static double membershipGradeInv(double datDuro, double x0, double x1, double pendiente) {
        if (datDuro <= x0) {
            return 1.0;
        } else if (datDuro > x0 && datDuro <= x1) {
            return pendiente; // Fórmula pendiente
        } else {
            return 0.0;
        }
    }

    public static double membershipTriangular(double datDuro, double x0, double x1, double x2, double pendiente) {
        if (datDuro <= x0) {
            return 0.0;
        } else if (datDuro > x0 && datDuro <= x1) {
            return pendiente;
        } else if (datDuro > x1 && datDuro <= x2) {
            return pendiente;
        } else {
            return 0.0;
        }
    }

    public static double membershipTrapezoidal(double datDuro, double x0, double x1, double x2, double x3, double pendiente) {
        if (datDuro <= x0) {
            return 0.0;
        } else if (datDuro > x0 && datDuro <= x1) {
            return pendiente;
        } else if (datDuro > x1 && datDuro <= x2) {
            return 1.0;
        } else if (datDuro > x2 && datDuro <= x3) {
            return pendiente;
        } else {
            return 0.0;
        }
    }
    public static double pendiente(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            // La pendiente es indefinida si los puntos tienen la misma coordenada x
            return Double.POSITIVE_INFINITY;
        } else {
            // Calcula la pendiente usando la fórmula (y2 - y1) / (x2 - x1)
            return (y2 - y1) / (x2 - x1);
        }
    }
}
