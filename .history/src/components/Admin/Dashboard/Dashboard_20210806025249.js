import React from "react";
import { withStyles, makeStyles } from "@material-ui/core/styles";
import { Grid } from "@material-ui/core";
import TextField from "material-ui/TextField";
import { Button } from "@material-ui/core";
import Typography from "@material-ui/core/Typography";
import Container from "@material-ui/core/Container";
import CssBaseline from "@material-ui/core/CssBaseline";
import useStyles from "../../styles";
import Orders from "../../UserOrder/orders";

// TODO apply data here
const rows = [
  {
    orderID: "r82hoefiw",
    userID: "sam",
    ProductName: "guitar",
    price: "2000",
    quantity: "1",
  },
];

export default function DashboardPage() {
  const classes = useStyles();

  return (
    <Grid container spacing={}>
      <Grid item xs={6}>
        <Orders />
      </Grid>
      <Grid item xs={6}>
        <img
          style={{ padding: "80px" }}
          src="https://www.wikihow.com/images/thumb/1/18/Take-Better-Notes-Step-1-Version-2.jpg/v4-460px-Take-Better-Notes-Step-1-Version-2.jpg.webp"
        ></img>
      </Grid>
    </Grid>
  );
}
