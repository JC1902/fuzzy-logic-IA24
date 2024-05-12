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

    public static double membershipGrade(double datDuro, double x0, double x1) {
        if (datDuro <= x0) {
            return 0.0;
        } else if (datDuro > x0 && datDuro <= x1) {
            return FuncionesMembresia.pendiente(x0, x1); // Fórmula pendiente
        } else {
            return 1.0;
        }
    }

    public static double membershipGradeInv(double datDuro, double x0, double x1) {
        if (datDuro <= x0) {
            return 1.0;
        } else if (datDuro > x0 && datDuro <= x1) {
            return FuncionesMembresia.pendiente(x0, x1); // Fórmula pendiente
        } else {
            return 0.0;
        }
    }

    public static double membershipTriangular(double datDuro, double x0, double x1, double x2) {
        if (datDuro <= x0) {
            return 0.0;
        } else if (datDuro > x0 && datDuro <= x1) {
            return FuncionesMembresia.pendiente(x0, x1);
        } else if (datDuro > x1 && datDuro <= x2) {
            return FuncionesMembresia.pendiente(x1, x2);
        } else {
            return 0.0;
        }
    }

    public static double membershipTrapezoidal(double datDuro, double x0, double x1, double x2, double x3) {
        if (datDuro <= x0) {
            return 0.0;
        } else if (datDuro > x0 && datDuro <= x1) {
            return FuncionesMembresia.pendiente(x0, x1);
        } else if (datDuro > x1 && datDuro <= x2) {
            return 1.0;
        } else if (datDuro > x2 && datDuro <= x3) {
            return FuncionesMembresia.pendiente(x2, x3);
        } else {
            return 0.0;
        }
    }
    
    public static double pendiente(double x1, double x2) {
        if (x1 == x2) {
            // La pendiente es indefinida si los puntos tienen la misma coordenada x
            return Double.POSITIVE_INFINITY;
        } else {
            // Calcula la pendiente usando la fórmula (y2 - y1) / (x2 - x1)
            return (1 - 0) / (x2 - x1);
        }
    }
}
