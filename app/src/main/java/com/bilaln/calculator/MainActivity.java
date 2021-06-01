package com.bilaln.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.lang.Math;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Optional;

public class MainActivity extends AppCompatActivity {
    TextView tvresult, tvsign, tvfinder;
    Button btnunderrt, btnlog, btnsin, btncos, btntan, btn9, btn8, btn7, btn6, btn5, btn4, btn3, btn2, btn1, btn0, btnadd, btnsub, btnmul, btndiv, btneql, btnclr, btnpower, btndot, btnpie;
    double num1 = 0, num2 = 0, result = 0, a = 0, b = 0;
    String oprtr = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvresult = (TextView) findViewById(R.id.tvresiult);
        tvsign = (TextView) findViewById(R.id.tvsign);
        tvfinder = (TextView) findViewById(R.id.tvfinder);
        btnunderrt = (Button) findViewById(R.id.btnunderrt);
        btnlog = (Button) findViewById(R.id.btnlog);
        btnsin = (Button) findViewById(R.id.btnsin);
        btncos = (Button) findViewById(R.id.btncos);
        btntan = (Button) findViewById(R.id.btntan);
        btn9 = (Button) findViewById(R.id.btn9);
        btn8 = (Button) findViewById(R.id.btn8);
        btn7 = (Button) findViewById(R.id.btn7);
        btn6 = (Button) findViewById(R.id.btn6);
        btn5 = (Button) findViewById(R.id.btn5);
        btn4 = (Button) findViewById(R.id.btn4);
        btn3 = (Button) findViewById(R.id.btn3);
        btn2 = (Button) findViewById(R.id.btn2);
        btn1 = (Button) findViewById(R.id.btn1);
        btn0 = (Button) findViewById(R.id.btn0);
        btnadd = (Button) findViewById(R.id.btnadd);
        btnsub = (Button) findViewById(R.id.btnsub);
        btnmul = (Button) findViewById(R.id.btnmul);
        btndiv = (Button) findViewById(R.id.btndiv);
        btndot = (Button) findViewById(R.id.btndot);
        btnpie = (Button) findViewById(R.id.btnpie);

        btnclr = (Button) findViewById(R.id.btnclear);
        btnpower = (Button) findViewById(R.id.btnpower);
        btneql = (Button) findViewById(R.id.btneql);
        tvfinder.setText("");
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsign.setText(tvsign.getText() + "0");
                tvfinder.setText(tvfinder.getText() + "0");

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsign.setText(tvsign.getText() + "1");
                tvfinder.setText(tvfinder.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsign.setText(tvsign.getText() + "2");
                tvfinder.setText(tvfinder.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsign.setText(tvsign.getText() + "3");
                tvfinder.setText(tvfinder.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsign.setText(tvsign.getText() + "4");
                tvfinder.setText(tvfinder.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsign.setText(tvsign.getText() + "5");
                tvfinder.setText(tvfinder.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsign.setText(tvsign.getText() + "6");
                tvfinder.setText(tvfinder.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsign.setText(tvsign.getText() + "7");
                tvfinder.setText(tvfinder.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsign.setText(tvsign.getText() + "8");
                tvfinder.setText(tvfinder.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsign.setText(tvsign.getText() + "9");
                tvfinder.setText(tvfinder.getText() + "9");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvsign.getText() == "") {
                    tvsign.setText(tvsign.getText() + "0.");
                    tvfinder.setText(tvfinder.getText() + "0.");
                } else {
                    tvsign.setText(tvsign.getText() + ".");
                    tvfinder.setText(tvfinder.getText() + ".");
                }
            }
        });
        btnpie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (tvsign.getText() == "") {
                        tvresult.setText("Error");
                    } else {

                        tvsign.setText(tvfinder.getText() + "π");
                    }
                    oprtr = "pie";
                } catch (Exception ex) {
                    tvresult.setText("Error");
                    tvsign.setText("");

                }
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvfinder.getText() == "") {
                } else {
                    switch (oprtr) {
                        case "":
                            tvsign.setText(tvsign.getText() + "+");
                            result = Double.parseDouble(tvfinder.getText().toString());
                            tvfinder.setText("");
                            oprtr = "+";
                            break;
                        case "+":
                            tvsign.setText("+");
                            adder();

                            break;
                        case "-":
                            tvsign.setText("+");
                            minus();
                            break;
                        case "*":
                            tvsign.setText("+");
                            multply();
                            break;
                        case "/":
                            tvsign.setText("+");
                            div();
                            break;
                        case "sin":
                            tvsign.setText("+");
                            sin();
                            break;
                        case "cos":
                            tvsign.setText("+");
                            cos();
                            break;
                        case "tan":
                            tvsign.setText("+");
                            tan();
                            break;
                        case "pow":
                            tvsign.setText("+");
                            pow();
                            break;
                        case "log":
                            tvsign.setText("+");
                            log();
                            break;
                        case "root":
                            tvsign.setText("+");
                            sqrt();
                            break;
                        case "pie":
                            tvsign.setText("+");
                            pie();
                            break;
                        default:
                            break;
                    }
                    oprtr = "+";
                }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvfinder.getText() == "") {
                } else {
                    switch (oprtr) {
                        case "":
                            tvsign.setText(tvsign.getText() + "-");
                            result = Double.parseDouble(tvfinder.getText().toString());
                            tvfinder.setText("");
                            oprtr = "-";
                            break;
                        case "+":
                            tvsign.setText("-");
                            adder();

                            break;
                        case "-":
                            tvsign.setText("-");
                            minus();
                            break;
                        case "*":
                            tvsign.setText("-");
                            multply();
                            break;
                        case "/":
                            tvsign.setText("-");
                            div();
                            break;
                        case "sin":
                            tvsign.setText("-");
                            sin();
                            break;
                        case "cos":
                            tvsign.setText("-");
                            cos();
                            break;
                        case "tan":
                            tvsign.setText("-");
                            tan();
                            break;
                        case "pow":
                            tvsign.setText("-");
                            pow();
                            break;
                        case "log":
                            tvsign.setText("-");
                            log();
                            break;
                        case "root":
                            tvsign.setText("-");
                            sqrt();
                            break;
                        case "pie":
                            tvsign.setText("-");
                            pie();
                            break;
                        default:
                            break;
                    }
                    oprtr = "-";
                }

            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvfinder.getText() == "") {
                } else {
                    switch (oprtr) {
                        case "":
                            tvsign.setText(tvsign.getText() + "×");
                            result = Double.parseDouble(tvfinder.getText().toString());
                            tvfinder.setText("");
                            oprtr = "×";
                            break;
                        case "+":
                            tvsign.setText("×");
                            adder();
                            break;
                        case "-":
                            tvsign.setText("×");
                            minus();
                            break;
                        case "*":
                            tvsign.setText("×");
                            multply();
                            break;
                        case "/":
                            tvsign.setText("×");
                            div();
                            break;
                        case "sin":
                            tvsign.setText("×");
                            sin();
                            break;
                        case "cos":
                            tvsign.setText("×");
                            cos();
                            break;
                        case "tan":
                            tvsign.setText("×");
                            tan();
                            break;
                        case "pow":
                            tvsign.setText("×");
                            pow();
                            break;
                        case "log":
                            tvsign.setText("×");
                            log();
                            break;
                        case "root":
                            tvsign.setText("×");
                            sqrt();
                            break;
                        case "pie":
                            tvsign.setText("×");
                            pie();
                            break;
                        default:
                            break;
                    }
                    oprtr = "*";
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvfinder.getText() == "") {
                } else {
                    switch (oprtr) {
                        case "":
                            tvsign.setText(tvsign.getText() + "÷");
                            result = Double.parseDouble(tvfinder.getText().toString());
                            tvfinder.setText("");
                            oprtr = "/";
                            break;
                        case "+":
                            tvsign.setText("÷");
                            adder();
                            break;
                        case "-":
                            tvsign.setText("÷");
                            minus();
                            break;
                        case "*":
                            tvsign.setText("÷");
                            multply();
                            break;
                        case "/":
                            tvsign.setText("÷");
                            div();
                            break;
                        case "sin":
                            tvsign.setText("+");
                            sin();
                            break;
                        case "cos":
                            tvsign.setText("÷");
                            cos();
                            break;
                        case "tan":
                            tvsign.setText("÷");
                            tan();
                            break;
                        case "pow":
                            tvsign.setText("÷");
                            pow();
                            break;
                        case "log":
                            tvsign.setText("÷");
                            log();
                            break;
                        case "root":
                            tvsign.setText("÷");
                            sqrt();
                            break;
                        case "pie":
                            tvsign.setText("÷");
                            pie();
                            break;
                        default:
                            break;
                    }
                    oprtr = "/";
                }
            }
        });
        btnpower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvfinder.getText() == "") {
                } else {
                    tvsign.setText(tvfinder.getText() + "^");
                    a = Double.parseDouble(tvfinder.getText().toString());
                    tvfinder.setText("");
                    oprtr = "pow";
                }
            }
        });
        btnsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvfinder.getText() == "" && tvsign.getText() == "") {
                    tvsign.setText("sin(");
                    oprtr = "sin";
                } else {
                    tvresult.setText("Error");
                }
            }
        });
        btncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvfinder.getText() == "" && tvsign.getText() == "") {
                    tvsign.setText("cos(");
                    oprtr = "cos";
                } else {
                    tvresult.setText("Error");
                }
            }
        });
        btntan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvfinder.getText() == "" && tvsign.getText() == "") {
                    tvsign.setText("tan(");
                    oprtr = "tan";
                } else {
                    tvresult.setText("Error");
                }
            }
        });
        btnunderrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvfinder.getText() == "" && tvsign.getText() == "") {
                    tvsign.setText("√");
                    oprtr = "root";
                } else {
                    tvresult.setText("Error");
                }
            }
        });
        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvfinder.getText() == "" && tvsign.getText() == "") {
                    tvsign.setText("log");
                    oprtr = "log";
                } else {
                    tvresult.setText("Error");
                }
            }
        });

        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvresult.setText("");
                tvsign.setHint("0");
                tvsign.setText("");
                tvfinder.setText("");
                oprtr = "";
                result = 0;
                num1 = 0;
                a = 0;
                b = 0;

            }
        });
        btneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    try {
                        switch (oprtr) {
                            case "":
                                //tvresult.setText(String.valueOf(result));
                                break;
                            case "+":
                                tvsign.setHint("");
                                adder();
                                break;
                            case "-":
                                tvsign.setHint("");
                                minus();
                                break;
                            case "*":
                                tvsign.setHint("");
                                multply();
                                break;
                            case "/":
                                tvsign.setHint("");
                                div();
                                break;
                            case "pow":
                                tvsign.setHint("");
                                pow();
                                break;
                            case "sin":
                                tvsign.setHint("");
                                sin();
                                break;
                            case "cos":
                                tvsign.setHint("");
                                cos();
                                break;
                            case "tan":
                                tvsign.setHint("");
                                tan();
                                break;
                            case "root":
                                tvsign.setHint("");
                                sqrt();
                                break;
                            case "log":
                                tvsign.setHint("");
                                log();
                                break;
                            case "pie":
                                tvsign.setHint("");
                                pie();
                                break;


                        }
                        tvfinder.setText(String.valueOf(result));
                        result = 0;
                        a = 0;
                        b = 0;
                        oprtr = "";
                        tvsign.setText("");
                    } catch (Exception e) {
                        tvresult.setText("Error");
                        tvsign.setText("");
                        tvfinder.setText("");
                        result = 0;
                    }
                } catch (Exception e) {
                    tvresult.setText("Error");
                    tvsign.setText("");
                    tvfinder.setText("");
                    result = 0;
                }

            }
        });


    }

    public void adder() {
        result = result + (Double.parseDouble(tvfinder.getText().toString()));
        if (result % 1 != 0) {
            tvresult.setText(String.valueOf(result));
        } else {
            int res = (int) result;
            tvresult.setText(String.valueOf(res));
        }
        tvfinder.setText(null);
    }

    public void minus() {
        result = result - (Double.parseDouble(tvfinder.getText().toString()));
        if (result % 1 != 0) {
            tvresult.setText(String.valueOf(result));
        } else {
            int res = (int) result;
            tvresult.setText(String.valueOf(res));
        }
        tvfinder.setText(null);
    }

    public void multply() {
        result = result * (Double.parseDouble(tvfinder.getText().toString()));
        if (result % 1 != 0) {
            tvresult.setText(String.valueOf(result));
        } else {
            int res = (int) result;
            tvresult.setText(String.valueOf(res));
        }
        tvfinder.setText(null);

    }

    public void div() {
        result = result / (Double.parseDouble(tvfinder.getText().toString()));
        if (result % 1 != 0) {
            tvresult.setText(String.valueOf(result));
        } else {
            int res = (int) result;
            tvresult.setText(String.valueOf(res));
        }
        tvfinder.setText(null);
    }

    public void log() {
        a = Double.parseDouble(tvfinder.getText().toString());
        result = Math.log(a);

        if (result % 1 != 0) {
            tvresult.setText(String.valueOf(result));
        } else {
            int res = (int) result;
            tvresult.setText(String.valueOf(res));
        }
        tvfinder.setText(null);
    }

    public void sin() {
        a = Double.parseDouble(tvfinder.getText().toString());
        result = Math.sin(a);

        if (result % 1 != 0) {
            tvresult.setText(String.valueOf(result));
        } else {
            int res = (int) result;
            tvresult.setText(String.valueOf(res));
        }
        tvfinder.setText(null);
    }

    public void cos() {
        a = Double.parseDouble(tvfinder.getText().toString());
        result = Math.cos(a);

        if (result % 1 != 0) {
            tvresult.setText(String.valueOf(result));
        } else {
            int res = (int) result;
            tvresult.setText(String.valueOf(res));
        }
        tvfinder.setText(null);
    }

    public void tan() {
        a = Double.parseDouble(tvfinder.getText().toString());
        result = Math.tan(a);

        if (result % 1 != 0) {
            tvresult.setText(String.valueOf(result));
        } else {
            int res = (int) result;
            tvresult.setText(String.valueOf(res));
        }
        tvfinder.setText(null);
    }

    public void sqrt() {
        a = Double.parseDouble(tvfinder.getText().toString());
        result = Math.sqrt(a);

        if (result % 1 != 0) {
            tvresult.setText(String.valueOf(result));
        } else {
            int res = (int) result;
            tvresult.setText(String.valueOf(res));
        }
        tvfinder.setText(null);
    }

    public void pow() {
        b = Double.parseDouble(tvfinder.getText().toString());
        result = Math.pow(a, b);

        if (result % 1 != 0) {
            tvresult.setText(String.valueOf(result));
        } else {
            int res = (int) result;
            tvresult.setText(String.valueOf(res));
        }
        tvfinder.setText(null);
    }

    public void pie() {
        double pie = Double.parseDouble(tvfinder.getText().toString());
        result = pie * 3.14;

        if (result % 1 != 0) {
            tvresult.setText(String.valueOf(result));
        } else {
            int res = (int) result;
            tvresult.setText(String.valueOf(res));
        }
        tvfinder.setText(null);
    }
}

