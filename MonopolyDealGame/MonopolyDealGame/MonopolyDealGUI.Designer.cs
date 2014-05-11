namespace MonopolydealGame
{
    partial class UserControl1
    {
        /// <summary> 
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary> 
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Component Designer generated code

        /// <summary> 
        /// Required method for Designer support - do not modify 
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.monopolyDealToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.panel1 = new System.Windows.Forms.Panel();
            this.MonopolyDeal = new System.Windows.Forms.Panel();
            this.menuStrip1.SuspendLayout();
            this.panel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.monopolyDealToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(258, 24);
            this.menuStrip1.TabIndex = 0;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // monopolyDealToolStripMenuItem
            // 
            this.monopolyDealToolStripMenuItem.Name = "monopolyDealToolStripMenuItem";
            this.monopolyDealToolStripMenuItem.Size = new System.Drawing.Size(89, 20);
            this.monopolyDealToolStripMenuItem.Text = "Monopoly Deal";
            this.monopolyDealToolStripMenuItem.Click += new System.EventHandler(this.monopolyDealToolStripMenuItem_Click);
            // 
            // panel1
            // 
            this.panel1.BackColor = System.Drawing.Color.White;
            this.panel1.Controls.Add(this.MonopolyDeal);
            this.panel1.Location = new System.Drawing.Point(3, 27);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(254, 261);
            this.panel1.TabIndex = 1;
            // 
            // MonopolyDeal
            // 
            this.MonopolyDeal.BackColor = System.Drawing.Color.Blue;
            this.MonopolyDeal.Location = new System.Drawing.Point(4, 4);
            this.MonopolyDeal.Name = "MonopolyDeal";
            this.MonopolyDeal.Size = new System.Drawing.Size(247, 46);
            this.MonopolyDeal.TabIndex = 0;
            this.MonopolyDeal.Paint += new System.Windows.Forms.PaintEventHandler(this.panel2_Paint);
            // 
            // UserControl1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.menuStrip1);
            this.Name = "UserControl1";
            this.Size = new System.Drawing.Size(258, 288);
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.panel1.ResumeLayout(false);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem monopolyDealToolStripMenuItem;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Panel MonopolyDeal;

    }
}
