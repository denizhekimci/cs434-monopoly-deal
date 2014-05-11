using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Text;
using System.Windows.Forms;

namespace MonopolydealGame
{
    public partial class UserControl1 : UserControl
    {
        public UserControl1()
        {
            InitializeComponent();
        }

        private void monopolyDealToolStripMenuItem_Click(object sender, EventArgs e)
        {

        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void panel2_Paint(object sender, PaintEventArgs e)
        {
            Label newLabel = new Label();
            newLabel.Visible = true;
            newLabel.Text = "Monopoly Deal Game";
            newLabel.AutoSize = true;
            panel1.Container.Add(newLabel);
        }
    }
}
