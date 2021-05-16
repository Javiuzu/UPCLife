package com.kinoboes.upclife.ui.Laboratorios;

public class LabCompanion {

    private String name;
    private String comment;
    public enum Assigs{F, FM, IC, PRO1, EC, M1, M2, PRO2, BD, CI, EDA, PE, SO,
        AC, EEE, IDI, IES, XC, PAR, PROP, A, G, IA, LI, LP, TC, AA, APA, CAIM,
        CL, CN, IO, SID, AC2, DSBM, MP, PEC, SO2, XC2, CASO, CPD, PAP, PCA, PDS, STR, VLSI,
        AS, ASW, DBD, ER, GPS, PES, CAP, CBDE, CSI, ECSDI, SIM, SOAD, ADEI, DSI, NE, PSI,
        SIO, ABD, EDO, MI, VPE, ASO, PI, PTI, SI, SOA, TXC, AD, IM, SDX, TCI,
        APC, APSS, ASDP, ASMI, C, CCQ, CDI, DCS, FDM, FOMAR, GCS, GEOC, MD, PAE, ROB, SLDS, TGA, VC,
        VJ, WSE} ;
    private Assigs assig;

    public LabCompanion(String Name, Assigs Assig) {
        name = Name;
        assig = Assig;
        comment = null;
    }
    public LabCompanion(String Name, Assigs Assig, String Comment) {
        name = Name;
        comment = Comment;
        assig = Assig;
    }

    public String getComment() {
        return comment;
    }

    public String getName() {
        return name;
    }

    public String getAssig() {
        switch (assig) {
            case F:
                return "F";
            case FM:
                return "FM";
            case IC:
                return "IC";
            case PRO1:
                return "PRO1";
            case EC:
                return "EC";
            case M1:
                return "M1";
                
            case M2:
                return "M2";
                
            case PRO2:
                return "PRO2";
                
            case BD:
                return "BD";
                
            case CI:
                return "CI";
                
            case EDA:
                return "EDA";
                
            case PE:
                return "PE";
                
            case SO:
                return "SO";
                
            case AC:
                return "AC";
                
            case EEE:
                return "EEE";
                
            case IDI:
                return "IDI";
                
            case IES:
                return "IES";
                
            case XC:
                return "XC";
                
            case PAR:
                return "PAR";
                
            case PROP:
                return "PROP";
                
            case A:
                return "A";
                
            case G:
                return "G";
                
            case IA:
                return "IA";
                
            case LI:
                return "LI";
                
            case LP:
                return "LP";
                
            case TC:
                return "TC";
                
            case AA:
                return "AA";
                
            case APA:
                return "APA";
                
            case CAIM:
                return "CAIM";
                
            case CL:
                return "CL";
                
            case CN:
                return "CN";
                
            case IO:
                return "IO";
                
            case SID:
                return "SID";
                
            case AC2:
                return "AC2";
                
            case DSBM:
                return "DSBM";
                
            case MP:
                return "MP";
                
            case PEC:
                return "PEC";
                
            case SO2:
                return "SO2";
                
            case XC2:
                return "XC2";
                
            case CASO:
                return "CASO";
                
            case CPD:
                return "CPD";
                
            case PAP:
                return "PAP";
                
            case PCA:
                return "PCA";
                
            case PDS:
                return "PDS";
                
            case STR:
                return "STR";
                
            case VLSI:
                return "VLSI";
                
            case AS:
                return "AS";
                
            case ASW:
                return "ASW";
                
            case DBD:
                return "DBD";
                
            case ER:
                return "ER";
                
            case GPS:
                return "GPS";
                
            case PES:
                return "PES";
                
            case CAP:
                return "CAP";
                
            case CBDE:
                return "CBDE";
                
            case CSI:
                return "CSI";
                
            case ECSDI:
                return "ECSDI";
                
            case SIM:
                return "SIM";
                
            case SOAD:
                return "SOAD";
                
            case ADEI:
                return "ADEI";
                
            case DSI:
                return "DSI";
                
            case NE:
                return "NE";
                
            case PSI:
                return "PSI";
                
            case SIO:
                return "SIO";
                
            case ABD:
                return "ABD";
                
            case EDO:
                return "EDO";
                
            case MI:
                return "MI";
                
            case VPE:
                return "VPE";
                
            case ASO:
                return "ASO";
                
            case PI:
                return "PI";
                
            case PTI:
                return "PTI";
                
            case SI:
                return "SI";
                
            case SOA:
                return "SOA";
                
            case TXC:
                return "TXC";
                
            case AD:
                return "AD";
                
            case IM:
                return "IM";
                
            case SDX:
                return "SDX";
                
            case TCI:
                return "TCI";
                
            case APC:
                return "APC";
                
            case APSS:
                return "APSS";
                
            case ASDP:
                return "ASDP";
                
            case ASMI:
                return "ASMI";
                
            case C:
                return "C";
                
            case CCQ:
                return "CCQ";
                
            case CDI:
                return "CDI";
                
            case DCS:
                return "DCS";
                
            case FDM:
                return "FDM";
                
            case FOMAR:
                return "FOMAR";
                
            case GCS:
                return "GCS";
                
            case GEOC:
                return "GEOC";
                
            case MD:
                return "MD";
                
            case PAE:
                return "PAE";
                
            case ROB:
                return "ROB";
                
            case SLDS:
                return "SLDS";
                
            case TGA:
                return "TGA";
                
            case VC:
                return "VC";
                
            case VJ:
                return "VJ";
                
            case WSE:
                return "WSE";
                
            default:
                return null;
                
        }
    }


}
